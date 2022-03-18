import command.AppleJuiceCommand;
import command.OrangeJuiceCommand;
import executor.Executor;
import invoker.Waiter;

/**
 * @author keminfeng
 * @date 2022-03-18 18:23
 */
public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Executor executor = new Executor();

        AppleJuiceCommand appleJuiceCommand = new AppleJuiceCommand(executor);
        OrangeJuiceCommand orangeJuiceCommand = new OrangeJuiceCommand(executor);

        waiter.orderJuice(appleJuiceCommand);
        waiter.orderJuice(appleJuiceCommand);
        waiter.orderJuice(orangeJuiceCommand);

        waiter.done();
    }
}
