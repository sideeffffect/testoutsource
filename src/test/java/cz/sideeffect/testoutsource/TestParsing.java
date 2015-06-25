package cz.sideeffect.testoutsource;

import cz.sideeffect.testoutsource.instructions.Add;
import cz.sideeffect.testoutsource.instructions.Apply;
import cz.sideeffect.testoutsource.instructions.Instruction;
import cz.sideeffect.testoutsource.instructions.Multiply;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class tests parsing instructions.
 */
public class TestParsing {

    @Test
    public void testAdd(){
        String input = "add 123";
        Instruction instruction = new Add(123);

        Assert.assertEquals(instruction, Instruction.parse(input));
    }

    @Test
    public void testMultiply(){
        String input = "multiply 456";
        Instruction instruction = new Multiply(456);

        Assert.assertEquals(instruction, Instruction.parse(input));
    }

    @Test
    public void testApply(){
        String input = "apply 789";
        Instruction instruction = new Apply(789);

        Assert.assertEquals(instruction, Instruction.parse(input));
    }
}
