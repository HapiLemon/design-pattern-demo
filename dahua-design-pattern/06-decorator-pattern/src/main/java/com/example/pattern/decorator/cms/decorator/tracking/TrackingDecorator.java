package com.example.pattern.decorator.cms.decorator.tracking;

import com.example.pattern.decorator.cms.broker.AbstractBroker;
import com.example.pattern.decorator.cms.broker.Broker;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:29
 */
public class TrackingDecorator extends AbstractBroker {

    private final AbstractBroker abstractBroker;

    public TrackingDecorator(AbstractBroker abstractBroker) {
        this.abstractBroker = abstractBroker;
    }

    @Override
    public Object create(String createParcelDto, String accountInfo) {
        return null;
    }

    @Override
    public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo) {
        return null;
    }

    public void logoutTrackingInfo(String fetchTrackingDto, String accountInfo) {
        Broker broker = (Broker) this.abstractBroker;
        System.out.println("Fetch tracking by below information");
        System.out.println("    trackingUrl: "+broker.getShipmentUrl());
        System.out.println("    wsdl: " + broker.getWsdlPath());
        System.out.println("    accountInfo: " + accountInfo);
        System.out.println("    fetchTrackingDto: " + fetchTrackingDto);
    }
}
