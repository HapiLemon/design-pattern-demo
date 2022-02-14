/**
 * @author keminfeng
 * @date 2022-02-14 16:02
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("准备茶");
        Beverage tea = new Tea();
        tea.prepareBeverage();
        
        System.out.println();
        
        System.out.println("准备咖啡");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
