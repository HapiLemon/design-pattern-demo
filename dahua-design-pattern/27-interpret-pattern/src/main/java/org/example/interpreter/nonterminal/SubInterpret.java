package org.example.interpreter.nonterminal;

import org.example.interpreter.AbstractInterpreter;
import org.example.interpreter.Interpreter;

/**
 * @author keminfeng
 */
public class SubInterpret extends AbstractInterpreter {

    public SubInterpret(Interpreter left, Interpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
