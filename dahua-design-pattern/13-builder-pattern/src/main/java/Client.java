import builder.FamilyBarrelBuilder;
import builder.FamilyBarrelOneBuilder;
import builder.FamilyBarrelTwoBuilder;
import director.Director;
import product.FamilyBarrel;

/**
 * @author keminfeng
 * @date 2022-02-17 10:49
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        FamilyBarrelBuilder familyBarrelOneBuilder = new FamilyBarrelOneBuilder();
        director.construct(familyBarrelOneBuilder);
        FamilyBarrel familyBarrelOne = familyBarrelOneBuilder.getFamilyBarrel();
        System.out.println(familyBarrelOne.toString());

        FamilyBarrelBuilder familyBarrelTwoBuilder = new FamilyBarrelTwoBuilder();
        director.construct(familyBarrelTwoBuilder);
        FamilyBarrel familyBarrelTwo = familyBarrelTwoBuilder.getFamilyBarrel();
        System.out.println(familyBarrelTwo.toString());
    }
}
