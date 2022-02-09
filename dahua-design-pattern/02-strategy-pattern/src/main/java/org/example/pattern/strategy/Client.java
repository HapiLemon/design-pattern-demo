package org.example.pattern.strategy;

/**
 * @author keminfeng
 * @date 2022-01-25 16:02
 */
public class Client {

    public static void main(String[] args) throws Exception {
        PriceCalculator priceCalculator = new PriceCalculator(ChargeRule.RETURN_300_100);
        Double totalPrice = 350.0;
        logout(totalPrice, priceCalculator.calculate(totalPrice));
    }

    private static void logout(Double price, Double finalPrice) {
        System.out.printf("原价%s元，现价%s元%n", price, finalPrice);
    }
}
