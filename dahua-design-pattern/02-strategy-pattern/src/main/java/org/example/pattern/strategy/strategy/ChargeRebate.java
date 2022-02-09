package org.example.pattern.strategy.strategy;

/**
 * @author keminfeng
 * @date 2022-01-25 16:09
 */
public class ChargeRebate implements ChargeStrategy {

    /**
     * 折扣率 8折 0.8
     */
    private final Double discountRate;

    public ChargeRebate(Double discountRate) throws Exception {
        if (discountRate > 1 || discountRate < 0) {
            throw new Exception("折扣需要在0到1之间");
        }
        this.discountRate = discountRate;
    }

    @Override
    public Double calculate(Double totalPrice) {
        return totalPrice * discountRate;
    }
}
