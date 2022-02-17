package product;

import lombok.Data;
import lombok.ToString;
import product.single.*;

/**
 * @author keminfeng
 * @date 2022-02-16 18:10
 */
@Data
@ToString
public class FamilyBarrel {

    private Drumstick drumstick;

    private CocaCola cocaCola;

    private Hamburger hamburger;

    private FrenchFries frenchFries;

    private Pie pie;
}
