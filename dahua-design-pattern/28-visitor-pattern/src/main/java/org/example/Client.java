package org.example;

import org.example.element.DevOps;
import org.example.element.Engineer;
import org.example.element.Manager;
import org.example.element.Staff;
import org.example.structure.BusinessReport;
import org.example.visitor.Ceo;
import org.example.visitor.Cto;

import java.util.List;

/**
 * @author keminfeng
 */
public class Client {

    public static void main(String[] args) {

        List<Staff> staffList = List.of(
                new Manager("经理-A"),
                new Engineer("工程师-A"),
                new Engineer("工程师-B"),
                new Engineer("工程师-C"),
                new Manager("经理-B"),
                new DevOps("运维-A"),
                new DevOps("运维-B"),
                new Engineer("工程师-D")
        );

        Ceo ceo = new Ceo();
        Cto cto = new Cto();

        System.out.println("==================CEO 查看报表===================");
        new BusinessReport().showReport(ceo, staffList);
        System.out.println("==================CTO 查看报表===================");
        new BusinessReport().showReport(cto, staffList);

    }

}
