import java.util.ArrayList;
import java.util.List;

/**
 * @author keminfeng
 * @date 2022-03-10 17:58
 */
public class TicketSeller implements Iterator {

    private List<Object> buyerList = new ArrayList<>();

    private int current = 0;

    public TicketSeller(List<Object> buyerList) {
        this.buyerList = buyerList;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.buyerList.get(current++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return current != buyerList.size();
    }
}
