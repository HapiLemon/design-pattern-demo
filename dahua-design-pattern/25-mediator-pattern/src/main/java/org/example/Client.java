package org.example;

import org.example.colleague.Iraq;
import org.example.colleague.USA;
import org.example.mediator.UnitedNationSecurityCouncil;

/**
 * @author keminfeng
 * @date 2022-03-22 11:58
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationSecurityCouncil unitedNationSecurityCouncil = new UnitedNationSecurityCouncil();

        USA usa = new USA(unitedNationSecurityCouncil);
        Iraq iraq = new Iraq(unitedNationSecurityCouncil);

        unitedNationSecurityCouncil.setCountry1(usa);
        unitedNationSecurityCouncil.setCountry2(iraq);

        usa.declare("Iraq CNM");
        iraq.declare("USA CNM");
    }
}
