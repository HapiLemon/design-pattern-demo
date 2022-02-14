/**
 * @author keminfeng
 * @date 2022-02-14 16:01
 */
public class Coffee extends Beverage{
    @Override
    protected void brew() {
        System.out.println("冲泡咖啡豆");
    }

    @Override
    protected boolean customWantsCondiments() {
        return true;
    }

    @Override
    protected void addCondiments() {
        System.out.println("加牛奶");
    }
}
