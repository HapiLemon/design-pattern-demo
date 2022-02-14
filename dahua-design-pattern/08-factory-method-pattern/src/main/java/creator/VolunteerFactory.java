package creator;

import product.LeiFeng;
import product.Volunteer;

/**
 * @author keminfeng
 * @date 2022-02-14 10:45
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Volunteer();
    }
}
