package com.example.pattern.decorator.cms.decorator.tracking;

import com.example.pattern.decorator.cms.broker.AbstractBroker;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:58
 */
public class DhlTrackingDecorator extends TrackingDecorator{
    
    public DhlTrackingDecorator(AbstractBroker abstractBroker) {
        super(abstractBroker);
    }

    @Override
    public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo) {
        System.out.println("Build fetching DHL tracking data");
        super.logoutTrackingInfo(fetchTrackingDto, accountInfo);
        System.out.println("Fetch DHL tracking");
        return null;
    }
}
