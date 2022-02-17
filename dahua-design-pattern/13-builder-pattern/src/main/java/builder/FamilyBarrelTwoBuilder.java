package builder;

import product.*;
import product.single.*;

/**
 * @author keminfeng
 * @date 2022-02-17 10:43
 */
public class FamilyBarrelTwoBuilder implements FamilyBarrelBuilder {

    private final FamilyBarrel familyBarrel = new FamilyBarrel();
    
    @Override
    public void buildCocaCola() {
        familyBarrel.setCocaCola(new CocaCola("大杯可乐"));
    }

    @Override
    public void buildDrumstick() {
        familyBarrel.setDrumstick(new Drumstick("盐焗鸡腿"));
    }

    @Override
    public void buildFrenchFries() {
        familyBarrel.setFrenchFries(new FrenchFries("大份薯条"));
    }

    @Override
    public void buildHamburger() {
        familyBarrel.setHamburger(new Hamburger("鳕鱼汉堡"));
    }

    @Override
    public void buildPie() {
        familyBarrel.setPie(new Pie("香芋派"));
    }

    @Override
    public FamilyBarrel getFamilyBarrel() {
        return familyBarrel;
    }
}
