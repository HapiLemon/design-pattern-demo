/**
 * @author keminfeng
 * @date 2022-03-10 18:03
 */
public interface Aggregate {

    void add(Object o);

    void remove(Object o);

    Iterator iterator();
}
