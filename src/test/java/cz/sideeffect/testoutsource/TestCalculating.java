package cz.sideeffect.testoutsource;

import cz.sideeffect.testoutsource.instructions.Add;
import cz.sideeffect.testoutsource.instructions.Apply;
import cz.sideeffect.testoutsource.instructions.Instruction;
import cz.sideeffect.testoutsource.instructions.Multiply;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class tests calculating with instructions.
 */
public class TestCalculating {
    
    @Test
    public void test1(){
        Instruction[] instructions = {new Add(2), new Multiply(3), new Apply(3)};
        Assert.assertEquals(15, Calculator.calculate(instructions));
    }

    @Test
    public void test2(){
        Instruction[] instructions = {new Multiply(9), new Apply(5)};
        Assert.assertEquals(45, Calculator.calculate(instructions));
    }

    @Test
    public void test3(){
        Instruction[] instructions = {new Apply(1)};
        Assert.assertEquals(1, Calculator.calculate(instructions));
    }
}
