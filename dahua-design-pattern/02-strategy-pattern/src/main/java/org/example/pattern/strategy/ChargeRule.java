package org.example.pattern.strategy;

/**
 * @author keminfeng
 * @date 2022-01-25 16:43
 */
public enum ChargeRule {
    /**
     * 正常收费
     */
    NORMAL,

    /**
     * 8折
     */
    REBATE_8,

    /**
     * 满300减100
     */
    RETURN_300_100,
}
