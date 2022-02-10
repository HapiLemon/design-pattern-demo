package com.example.pattern.decorator.cms.broker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:27
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Broker extends AbstractBroker{

    private String shipmentUrl;

    private String trackingUrl;

    private String wsdlPath;
    
    @Override
    public Object create(String createParcelDto, String accountInfo) {
        return null;
    }

    @Override
    public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo) {
        return null;
    }
}
