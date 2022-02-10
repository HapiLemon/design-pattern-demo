package com.example.pattern.decorator.cms;

import com.example.pattern.decorator.cms.broker.Broker;
import com.example.pattern.decorator.cms.decorator.shipment.ColissimoShipmentDecorator;
import com.example.pattern.decorator.cms.decorator.shipment.DhlShipmentDecorator;
import com.example.pattern.decorator.cms.decorator.tracking.ColissimoTrackingDecorator;
import com.example.pattern.decorator.cms.decorator.tracking.DhlTrackingDecorator;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:43
 */
public class Client {
    public static void main(String[] args) {
        Broker colissimoBroker = new Broker("COLISSIMO_SHIPMENT_URL", "COLISSIMO_TRACKING_URL", "COLISSIMO_WSDL_PATH");
        // COLISSIMO 下单
        ColissimoShipmentDecorator colissimoShipmentBroker = new ColissimoShipmentDecorator(colissimoBroker);
        Object colissimoParcel = colissimoShipmentBroker.create("COLISSIMO_CREATE_PARCEL_DTO", "COLISSIMO_ACCOUNT_INFO");
        // COLISSIMO 获取轨迹
        ColissimoTrackingDecorator colissimoTrackingBroker = new ColissimoTrackingDecorator(colissimoBroker);
        List<Object> colissimoTracking = colissimoTrackingBroker.fetchTracking("COLISSIMO_FETCH_TRACKING_DTO", "COLISSIMO_ACCOUNT_INFO");

        Broker dhlBroker = new Broker("DHL_SHIPMENT_URL", "DHL_TRACKING_URL", "DHL_WSDL_PATH");
        // DHL 下单
        DhlShipmentDecorator dhlShipmentBroker = new DhlShipmentDecorator(dhlBroker);
        Object dhlParcel = dhlShipmentBroker.create("DHL_CREATE_PARCEL_DTO", "DHL_ACCOUNT_INFO");
        // DHL 获取轨迹
        DhlTrackingDecorator dhlTrackingBroker = new DhlTrackingDecorator(dhlBroker);
        List<Object> dhlTracking = dhlTrackingBroker.fetchTracking("DHL_FETCH_TRACKING_DTO", "DHL_ACCOUNT_INFO");
    }
}
