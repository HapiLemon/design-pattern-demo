package builder;

import product.*;
import product.single.*;

/**
 * @author keminfeng
 * @date 2022-02-17 10:43
 */
public class FamilyBarrelOneBuilder implements FamilyBarrelBuilder {

    private final FamilyBarrel familyBarrel = new FamilyBarrel();
    
    @Override
    public void buildCocaCola() {
        familyBarrel.setCocaCola(new CocaCola("中杯可乐"));
    }

    @Override
    public void buildDrumstick() {
        familyBarrel.setDrumstick(new Drumstick("麦辣鸡腿"));
    }

    @Override
    public void buildFrenchFries() {
        familyBarrel.setFrenchFries(new FrenchFries("小份薯条"));
    }

    @Override
    public void buildHamburger() {
        familyBarrel.setHamburger(new Hamburger("牛肉汉堡"));
    }

    @Override
    public void buildPie() {
        familyBarrel.setPie(new Pie("菠萝派"));
    }

    @Override
    public FamilyBarrel getFamilyBarrel() {
        return familyBarrel;
    }
}
