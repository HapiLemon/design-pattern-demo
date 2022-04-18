package org.example.interpreter.nonterminal;

import org.example.interpreter.AbstractInterpreter;
import org.example.interpreter.Interpreter;

/**
 * @author keminfeng
 */
public class AddInterpret extends AbstractInterpreter {

    public AddInterpret(Interpreter left, Interpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
