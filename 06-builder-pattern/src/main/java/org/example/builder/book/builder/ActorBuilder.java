package org.example.builder.book.builder;

import org.example.builder.book.Actor;

public abstract class ActorBuilder {

    protected Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairStyle();

    public Actor createActor() {
        return actor;
    }

    /**
     * 资源钩子
     * @return
     */
    public boolean isBareheaded() {
        return false;
    }
}
