package org.example.interpreter.terminal;

import org.example.interpreter.Interpreter;

/**
 * @author keminfeng
 */
public class NumberInterpreter implements Interpreter {

    private final int result;

    public NumberInterpreter(int result) {
        this.result = result;
    }

    @Override
    public int interpret() {
        return this.result;
    }
}
