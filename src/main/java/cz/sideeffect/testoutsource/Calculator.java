package cz.sideeffect.testoutsource;

import cz.sideeffect.testoutsource.instructions.Instruction;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents the calculator
 */
public class Calculator {

    /**
     * performs the calculation with supplied instructions
     * @param instructions must not be empty, the last instruction must be Apply
     * @return result of the calculation
     */
    public static int calculate(List<Instruction> instructions){
        Instruction apply = instructions.get(instructions.size() -1); // here we assume the last instruction is Apply
        instructions.remove(instructions.size() - 1);
        
        int accumulator = apply.execute(0); // here is the operand ignored (0 in this case)
        
        for(Instruction instruction : instructions){
            accumulator = instruction.execute(accumulator); // here we assume no instruction is Apply
        }
        
        return accumulator;
    }
    
    public static int calculate(Instruction[] instructions){
        return calculate(new ArrayList<>(Arrays.asList(instructions)));
    }

    /**
     * parses instructions from the input represented by the reader
     * @param reader source of serialized instructions
     * @return parsed instructions
     * @throws IOException
     */
    public static List<Instruction> parse(BufferedReader reader) throws IOException {
        List<Instruction> instructions = new ArrayList<>();
        
        String line;
        while((line = reader.readLine()) != null){
            instructions.add(Instruction.parse(line));
        }
        
        return instructions;
    }

    /**
     * performs the calculation, the input is read from the supplied reader
     * @param reader the source of serialized instructions
     * @return result of the calculation
     * @throws IOException
     */
    public static int calculate(BufferedReader reader) throws IOException {
        List<Instruction> instructions = Calculator.parse(reader);
        return Calculator.calculate(instructions);
    }
}
