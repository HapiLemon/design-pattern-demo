package org.example.interpreter;

/**
 * @author keminfeng
 */
public abstract class AbstractInterpreter implements Interpreter {

    protected Interpreter left;

    protected Interpreter right;

    public AbstractInterpreter(Interpreter left, Interpreter right) {
        this.left = left;
        this.right = right;
    }

    public abstract int interpret();

}
