package org.example.handler;

import org.example.request.Request;

/**
 * @author keminfeng
 * @date 2022-03-21 11:46
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getType())) {
            System.out.printf("%s类型请求，数量为%d。被%s批准%n", request.getType(), request.getNumber(), super.name);
        } else if ("加钱".equals(request.getType()) && request.getNumber() <= 500) {
            System.out.printf("%s类型请求，数量为%d。被%s批准%n", request.getType(), request.getNumber(), super.name);
        } else if ("加钱".equals(request.getType()) && request.getNumber() > 500) {
            System.out.println("再说吧");
        }
    }
}
