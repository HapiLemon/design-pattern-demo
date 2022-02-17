package builder;

import product.FamilyBarrel;

/**
 * @author keminfeng
 * @date 2022-02-17 10:41
 */
public interface FamilyBarrelBuilder {
    void buildCocaCola();

    void buildDrumstick();

    void buildFrenchFries();

    void buildHamburger();

    void buildPie();

    FamilyBarrel getFamilyBarrel();
}
