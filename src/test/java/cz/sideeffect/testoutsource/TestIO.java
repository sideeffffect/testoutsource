package cz.sideeffect.testoutsource;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class tests parsing instructions from input and calculating with parsed instructions.
 */
public class TestIO {
    
    private static final String resources = "src/test/resources";
    
    public int calculate(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(resources + "/" + fileName));
        return Calculator.calculate(reader);
    }

    @Test
    public void test1() throws IOException {
        Assert.assertEquals(15, calculate("test1"));
    }

    @Test
    public void test2() throws IOException {
        Assert.assertEquals(45, calculate("test2"));
    }

    @Test
    public void test3() throws IOException {
        Assert.assertEquals(1, calculate("test3"));
    }
}
