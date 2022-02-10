package com.example.pattern.decorator.cms.broker;

import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-10 11:26
 */
public abstract class AbstractBroker {

    /**
     * 下单
     * @return 包裹
     * @param createParcelDto
     * @param accountInfo
     */
    abstract public Object create(String createParcelDto,String accountInfo);

    /**
     * 获取轨迹
     * @return 轨迹信息
     * @param fetchTrackingDto
     * @param accountInfo
     */
    abstract public List<Object> fetchTracking(String fetchTrackingDto, String accountInfo);
}
