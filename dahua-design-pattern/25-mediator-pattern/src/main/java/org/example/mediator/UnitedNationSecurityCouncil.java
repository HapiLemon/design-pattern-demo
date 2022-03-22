package org.example.mediator;

import lombok.Data;
import org.example.colleague.Country;

/**
 * @author keminfeng
 * @date 2022-03-22 10:25
 */
@Data
public class UnitedNationSecurityCouncil extends UnitedNation {

    private Country country1;

    private Country country2;

    @Override
    public void declare(String message, Country country) {
        if (country == country1) {
            country2.getMessage(message);
        } else if (country == country2) {
            country1.getMessage(message);
        }
    }
}
