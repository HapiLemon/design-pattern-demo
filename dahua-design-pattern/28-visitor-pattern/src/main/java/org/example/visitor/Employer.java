package org.example.visitor;

import org.example.element.DevOps;
import org.example.element.Engineer;
import org.example.element.Manager;

/**
 * @author keminfeng
 */
public abstract class Employer {

    public abstract void visit(Engineer engineer);

    public abstract void visit(Manager manager);

    public abstract void visit(DevOps devOps);

}
