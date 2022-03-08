package spider;

/**
 * @author keminfeng
 * @date 2022-03-07 18:32
 */
public class Client {
    public static void main(String[] args) {
        Batch batch = new Batch();
        batch.setId("112-123456");
        batch.setFlightStatus(FlightStatusEnum.ATD);
        batch.sendMessage();
        batch.setFlightStatus(FlightStatusEnum.ATA);
        batch.sendMessage();
    }
}
