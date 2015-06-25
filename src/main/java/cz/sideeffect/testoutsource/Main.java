package cz.sideeffect.testoutsource;

import cz.sideeffect.testoutsource.instructions.Instruction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * The main class for the project.
 * It reads instructions from stdin and prints result to stdout.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        List<Instruction> instructions = Calculator.parse(reader);
        int result = Calculator.calculate(instructions);

        System.out.println(result);
    }
}
