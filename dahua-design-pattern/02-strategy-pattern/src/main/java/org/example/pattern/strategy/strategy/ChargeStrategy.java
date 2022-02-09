package org.example.pattern.strategy.strategy;

/**
 * @author keminfeng
 * @date 2022-01-25 16:03
 */
public interface ChargeStrategy {
    /**
     * 根据不同策略计算最终的金额
     *
     * @param totalPrice 待计算的金额
     * @return 最终的金额
     */
    Double calculate(Double totalPrice);
}
