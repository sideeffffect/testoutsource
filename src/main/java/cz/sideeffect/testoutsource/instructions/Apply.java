package cz.sideeffect.testoutsource.instructions;

/**
 * This class represents instruction for applying
 */
public class Apply extends Instruction {
    
    public static final String keyword = "apply";
    
    public Apply(int operandRight) {
        super(operandRight);
    }

    /**
     * initializes the calculation
     * @param ignored the parameter is ignored
     * @return operandRight
     */
    @Override
    public int execute(int ignored) {
        return operandRight;
    }

    /**
     *
     * @return "apply x" where x is operandRight
     */
    @Override
    public String keyword() {
        return keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apply apply = (Apply) o;

        return operandRight == apply.operandRight;

    }

    @Override
    public int hashCode() {
        return operandRight;
    }
}
