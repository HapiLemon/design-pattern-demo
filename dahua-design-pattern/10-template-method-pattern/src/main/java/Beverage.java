/**
 * @author keminfeng
 * @date 2022-02-14 15:56
 */
public abstract class Beverage {
    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("烧开水");
    }

    abstract protected void brew(); 

    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    abstract protected boolean customWantsCondiments();

    abstract protected void addCondiments(); 
}
