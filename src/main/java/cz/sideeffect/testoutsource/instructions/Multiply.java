package cz.sideeffect.testoutsource.instructions;

/**
 * This class represents instruction for multiplying
 */
public class Multiply extends Instruction {

    public static final String keyword = "multiply";
    
    public Multiply(int operandRight) {
        super(operandRight);
    }
    
    /**
     * performs multiplication
     * @param operandLeft the old accumulator
     * @return product of operandRight and operandLeft; the new accumulator
     */
    @Override
    public int execute(int operandLeft) {
        return operandLeft * operandRight;
    }
    
    /**
     *
     * @return "multiply"
     */
    @Override
    public String keyword() {
        return keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multiply multiply = (Multiply) o;

        return operandRight == multiply.operandRight;

    }

    @Override
    public int hashCode() {
        return operandRight;
    }
}
