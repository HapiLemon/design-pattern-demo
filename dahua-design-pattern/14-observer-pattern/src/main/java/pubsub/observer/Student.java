package pubsub.observer;

/**
 * @author keminfeng
 * @date 2022-02-23 16:05
 */
public class Student extends Observer{
    
    @Override
    public void receiveNotice() {
        System.out.println(super.getName() + "学生收到了通知");
    }
}
