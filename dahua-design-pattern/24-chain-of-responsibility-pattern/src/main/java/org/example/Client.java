package org.example;

import org.example.handler.CommonManager;
import org.example.handler.GeneralManager;
import org.example.handler.Majordomo;
import org.example.request.Request;

/**
 * @author keminfeng
 * @date 2022-03-21 11:51
 */
public class Client {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("张经理");
        Majordomo majordomo = new Majordomo("李总监");
        GeneralManager generalManager = new GeneralManager("王总经理");

        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request1 = new Request("请假", 2);
        Request request2 = new Request("请假", 4);
        Request request3 = new Request("请假", 10);
        Request request4 = new Request("加钱", 500);
        Request request5 = new Request("加钱", 1000);

        commonManager.handleRequest(request1);
        commonManager.handleRequest(request2);
        commonManager.handleRequest(request3);
        commonManager.handleRequest(request4);
        commonManager.handleRequest(request5);
    }
}
