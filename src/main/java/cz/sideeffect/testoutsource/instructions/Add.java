package cz.sideeffect.testoutsource.instructions;

/**
 * This class represents instruction for adding
 */
public class Add extends Instruction {

    public static final String keyword = "add";
    
    public Add(int operandRight) {
        super(operandRight);
    }

    /**
     * performs addition
     * @param operandLeft the old accumulator
     * @return sum of operandRight and operandLeft; the new accumulator
     */
    @Override
    public int execute(int operandLeft) {
        return operandLeft + operandRight;
    }

    /**
     * 
     * @return "add"
     */
    @Override
    public String keyword() {
        return keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Add add = (Add) o;

        return operandRight == add.operandRight;

    }

    @Override
    public int hashCode() {
        return operandRight;
    }
}
