package org.example.handler;

import org.example.request.Request;

/**
 * @author keminfeng
 * @date 2022-03-21 10:05
 */
public abstract class Manager {

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置继任者
     *
     * @param superior
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract void handleRequest(Request request);

}
