package org.example.util;

/**
 * @author keminfeng
 */
public enum OperatorEnum {

    LEFT_BRACKET("("),
    RIGHT_BRACKET(")"),
    ADD("+"),
    SUB("-"),
    MULTI("*"),
    DIV("/");
    private final String operator;

    OperatorEnum(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
