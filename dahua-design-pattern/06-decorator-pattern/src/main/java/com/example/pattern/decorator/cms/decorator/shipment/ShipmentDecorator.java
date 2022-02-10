package com.example.pattern.decorator.cms.decorator.shipment;

import com.example.pattern.decorator.cms.broker.AbstractBroker;
import com.example.pattern.decorator.cms.broker.Broker;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:28
 */
public class ShipmentDecorator extends AbstractBroker {

    private final AbstractBroker abstractBroker;

    public ShipmentDecorator(AbstractBroker abstractBroker) {
        this.abstractBroker = abstractBroker;
    }

    @Override
    public Object create(String createParcelDto,String accountInfo) {
        return null;
    }

    @Override
    public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo) {
        return null;
    }
    
    public void logoutShipmentInfo(String createParcelDto, String accountInfo) {
        Broker broker = (Broker) this.abstractBroker;
        System.out.println("Create shipment by below information");
        System.out.println("    shipmentUrl: "+broker.getShipmentUrl());
        System.out.println("    wsdl: " + broker.getWsdlPath());
        System.out.println("    accountInfo: " + accountInfo);
        System.out.println("    createParcelDto: " + createParcelDto);
    }
}
