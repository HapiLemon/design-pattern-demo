package com.example.pattern.decorator.cms.decorator.tracking;

import com.example.pattern.decorator.cms.broker.AbstractBroker;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:41
 */
public class ColissimoTrackingDecorator extends TrackingDecorator {
    
    public ColissimoTrackingDecorator(AbstractBroker abstractBroker) {
        super(abstractBroker);
    }

    @Override
    public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo) {
        System.out.println("Build fetching Colissimo tracking data");
        super.logoutTrackingInfo(fetchTrackingDto, accountInfo);
        System.out.println("Fetch Colissimo tracking");
        return null;
    }
}
