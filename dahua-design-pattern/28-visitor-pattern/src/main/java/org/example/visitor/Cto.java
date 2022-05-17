package org.example.visitor;

import org.example.element.DevOps;
import org.example.element.Engineer;
import org.example.element.Manager;

/**
 * @author keminfeng
 */
public class Cto extends Employer {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", 代码行数: " + engineer.getCodeLine());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", 产品数量: " + manager.getProductQuantity());
    }

    @Override
    public void visit(DevOps devOps) {
        System.out.println("运维: " + devOps.getName() + ", 服务器数量: " + devOps.getServerQuantity());
    }
}
