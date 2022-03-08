package spider;

/**
 * @author keminfeng
 * @date 2022-03-07 18:27
 */
public class FlightAtdStatus extends FlightStatus{
    @Override
    public void sendNotification() {
        System.out.println("推送ATD状态");
    }
}
