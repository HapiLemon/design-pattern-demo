package org.example.pattern.strategy.strategy;

/**
 * 满减 满300减100
 *
 * @author keminfeng
 * @date 2022-01-25 16:10
 */
public class ChargeReturn implements ChargeStrategy {

    /**
     * 满减条件
     */
    private final Double condition;

    /**
     * 满减金额
     */
    private final Double free;

    public ChargeReturn(Double condition, Double free) throws Exception {
        if (condition <= 0) {
            throw new Exception("满减条件要大于0");
        }
        this.condition = condition;
        this.free = free;
    }

    @Override
    public Double calculate(Double totalPrice) {
        return totalPrice - Math.floor(totalPrice / condition) * free;
    }
}
