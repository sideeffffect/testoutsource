package cz.sideeffect.testoutsource.instructions;

/**
 * This class represents instructions supported by the calculator
 */
public abstract class Instruction {
    protected final int operandRight;

    public Instruction(int operandRight) {
        this.operandRight = operandRight;
    }

    /**
     * performs the appropriate arithmetic operation
     * @param operandLeft the accumulator
     * @return the result
     */
    public abstract int execute(int operandLeft);

    /**
     * 
     * @return keyword of the instruction
     */
    public abstract String keyword();


    /**
     * parses line of input
     * @param input one line of the input
     * @return parsed instruction
     */
    public static Instruction parse(String input){
        String[] parts = input.split(" ");
        if(parts.length != 2){
            throw new RuntimeException("Invalid instructions, got " + input);
        }
        
        int operand = Integer.parseInt(parts[1]);
        
        if(parts[0].equals(Add.keyword)){
            return new Add(operand);
        }
        else if(parts[0].equals(Multiply.keyword)){
            return new Multiply(operand);
        }
        else if(parts[0].equals(Apply.keyword)){
            return new Apply(operand);
        }
        else {
            throw new RuntimeException("Unknown instruction, got " + input);
        }
    }

    @Override
    public String toString() {
        return keyword() + " " + operandRight;
    }
}
