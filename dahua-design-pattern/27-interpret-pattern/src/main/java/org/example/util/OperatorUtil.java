package org.example.util;

import org.example.interpreter.Interpreter;
import org.example.interpreter.nonterminal.AddInterpret;
import org.example.interpreter.nonterminal.DivideInterpret;
import org.example.interpreter.nonterminal.MultiInterpret;
import org.example.interpreter.nonterminal.SubInterpret;

import java.util.List;
import java.util.Stack;

/**
 * @author keminfeng
 */
public class OperatorUtil {

    public static final List<String> OPERATOR = List.of("+", "-", "*", "/");

    public static boolean isOperator(String str) {
        return OPERATOR.contains(str);
    }

    public static Interpreter getInterpreter(Stack<Interpreter> numberInterpreter, Stack<String> operatorStack) {
        Interpreter right = numberInterpreter.pop();
        Interpreter left = numberInterpreter.pop();
        String operator = operatorStack.pop();
        System.out.println("数字出栈：" + right.interpret() + "," + left.interpret() + ",操作符出栈:" + operator);

        switch (operator) {
            case "+":
                return new AddInterpret(left, right);
            case "-":
                return new SubInterpret(left, right);
            case "*":
                return new MultiInterpret(left, right);
            case "/":
                return new DivideInterpret(left, right);
            default:
                return null;
        }
    }

}
