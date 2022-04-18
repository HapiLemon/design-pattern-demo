package org.example.interpreter.nonterminal;

import org.example.interpreter.AbstractInterpreter;
import org.example.interpreter.Interpreter;

/**
 * @author keminfeng
 */
public class DivideInterpret extends AbstractInterpreter {

    public DivideInterpret(Interpreter left, Interpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
