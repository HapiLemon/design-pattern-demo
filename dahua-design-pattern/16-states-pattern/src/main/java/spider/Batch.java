package spider;

import lombok.Data;

/**
 * @author keminfeng
 * @date 2022-03-07 18:20
 */
@Data
public class Batch {

    private String id;   

    private FlightStatusEnum flightStatus;
    
    public void sendMessage() {
        this.flightStatus.getFlightStatus().sendNotification();
    }
}
