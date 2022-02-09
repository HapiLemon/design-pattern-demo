package org.example.pattern.strategy;

import org.example.pattern.strategy.strategy.ChargeNormal;
import org.example.pattern.strategy.strategy.ChargeRebate;
import org.example.pattern.strategy.strategy.ChargeReturn;
import org.example.pattern.strategy.strategy.ChargeStrategy;

/**
 * 价格计算器 <br>
 * 构造方法是一个工厂 工厂制作相应的策略示例 然后进行计算
 *
 * @author keminfeng
 * @date 2022-01-25 16:39
 */
public class PriceCalculator {

    private final ChargeStrategy chargeStrategy;

    public PriceCalculator(ChargeRule chargeRule) throws Exception {
        switch (chargeRule) {
            case REBATE_8:
                this.chargeStrategy = new ChargeRebate(0.8);
                break;
            case RETURN_300_100:
                this.chargeStrategy = new ChargeReturn(300.0, 100.0);
                break;
            case NORMAL:
            default:
                this.chargeStrategy = new ChargeNormal();
                break;
        }
    }

    public Double calculate(Double totalPrice) {
        return this.chargeStrategy.calculate(totalPrice);
    }

}
