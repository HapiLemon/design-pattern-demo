package com.example.pattern.decorator.cms.decorator.shipment;

import com.example.pattern.decorator.cms.broker.AbstractBroker;

/**
 * @author keminfeng
 * @date 2022-02-10 11:29
 */
public class ColissimoShipmentDecorator extends ShipmentDecorator {
    
    public ColissimoShipmentDecorator(AbstractBroker abstractBroker) {
        super(abstractBroker);
    }

    @Override
    public Object create(String createParcelDto, String accountInfo) {
        System.out.println("Build creating Colissimo shipment data");
        super.logoutShipmentInfo(createParcelDto, accountInfo);
        System.out.println("Created Colissimo parcel");
        return null;
    }
}
