package org.example.abstraction;

import org.example.implentor.Software;

/**
 * @author keminfeng
 * @date 2022-03-18 16:59
 */
public abstract class Phone {

    protected Software software;

    public void setSoft(Software software) {
        this.software = software;
    }

    public abstract void run();

}
