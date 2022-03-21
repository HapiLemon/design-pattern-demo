package org.example.handler;

import org.example.request.Request;

/**
 * @author keminfeng
 * @date 2022-03-21 11:44
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getType()) && request.getNumber() <= 5) {
            System.out.printf("%s类型请求，数量为%d。被%s批准%n", request.getType(), request.getNumber(), super.name);
        } else {
            if (superior != null) {
                superior.handleRequest(request);
            }
        }
    }
}
