import java.util.ArrayList;
import java.util.List;

/**
 * @author keminfeng
 * @date 2022-03-10 18:04
 */
public class Bus implements Aggregate {

    private final List<Object> passengerList = new ArrayList<>();

    @Override
    public void add(Object passenger) {
        passengerList.add(passenger);
    }

    @Override
    public void remove(Object passenger) {
        passengerList.remove(passenger);
    }

    @Override
    public Iterator iterator() {
        return new TicketSeller(passengerList);
    }
}
