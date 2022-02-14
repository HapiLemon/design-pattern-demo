import creator.LeiFengFactory;
import creator.UnderGraduateFactory;
import creator.VolunteerFactory;
import product.LeiFeng;

/**
 * @author keminfeng
 * @date 2022-02-14 10:45
 */
public class Client {
    public static void main(String[] args) {
        LeiFengFactory underGraduateFactory = new UnderGraduateFactory();
        LeiFeng underGraduate = underGraduateFactory.createLeifeng();
        underGraduate.Wash();

        LeiFengFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeifeng();
        volunteer.Sweep();
    }
}
