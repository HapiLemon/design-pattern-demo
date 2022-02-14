/**
 * @author keminfeng
 * @date 2022-02-14 16:00
 */
public class Tea extends Beverage{
    
    @Override
    protected void brew() {
        System.out.println("冲泡茶叶");
    }

    @Override
    protected boolean customWantsCondiments() {
        return true;
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }
}
