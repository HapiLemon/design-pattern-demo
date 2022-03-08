package spider;

import lombok.Getter;

/**
 * @author keminfeng
 * @date 2022-03-07 18:21
 */
@Getter
public enum FlightStatusEnum {
    
    // 航班起飞
    ATD(new FlightAtdStatus()),
    // 航班到达
    ATA(new FlightAtaStatus());

    final FlightStatus flightStatus;

    FlightStatusEnum(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }
}
