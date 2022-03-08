package spider;

/**
 * @author keminfeng
 * @date 2022-03-07 18:28
 */
public class FlightAtaStatus extends FlightStatus {

    @Override
    public void sendNotification() {
        System.out.println("推送ATA状态");
    }
}
