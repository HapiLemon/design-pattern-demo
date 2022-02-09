package org.example.pattern.strategy.strategy;

/**
 * 正常收费 不打折
 *
 * @author keminfeng
 * @date 2022-01-25 16:08
 */
public class ChargeNormal implements ChargeStrategy {

    @Override
    public Double calculate(Double totalPrice) {
        return totalPrice;
    }
}
