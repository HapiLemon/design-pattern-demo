package creator;

import product.LeiFeng;
import product.UnderGraduate;

/**
 * @author keminfeng
 * @date 2022-02-14 10:44
 */
public class UnderGraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new UnderGraduate();
    }
}
