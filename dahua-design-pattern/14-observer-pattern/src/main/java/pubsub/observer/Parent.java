package pubsub.observer;

/**
 * @author keminfeng
 * @date 2022-02-23 16:05
 */
public class Parent extends Observer{
    
    @Override
    public void receiveNotice() {
        System.out.println("家长" + super.getName() + "收到了通知");
    }
}
