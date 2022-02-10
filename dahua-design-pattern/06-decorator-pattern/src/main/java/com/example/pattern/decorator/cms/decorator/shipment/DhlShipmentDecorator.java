package com.example.pattern.decorator.cms.decorator.shipment;

import com.example.pattern.decorator.cms.broker.Broker;

/**
 * @author keminfeng
 * @date 2022-02-10 11:57
 */
public class DhlShipmentDecorator extends ShipmentDecorator{
    
    public DhlShipmentDecorator(Broker abstractBroker) {
        super(abstractBroker);
    }

    @Override
    public Object create(String createParcelDto, String accountInfo) {
        System.out.println("Build creating DHL shipment data");
        super.logoutShipmentInfo(createParcelDto, accountInfo);
        System.out.println("Created DHL parcel");
        return null;
    }
}
