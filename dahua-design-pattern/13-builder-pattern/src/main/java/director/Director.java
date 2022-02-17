package director;

import builder.FamilyBarrelBuilder;

/**
 * @author keminfeng
 * @date 2022-02-17 10:48
 */
public class Director {
    public void construct(FamilyBarrelBuilder familyBarrelBuilder) {
        familyBarrelBuilder.buildCocaCola();
        familyBarrelBuilder.buildHamburger();
        familyBarrelBuilder.buildDrumstick();
        familyBarrelBuilder.buildPie();
        familyBarrelBuilder.buildFrenchFries();
    }
}
