package org.example.builder.simplify.builder;

import org.example.builder.simplify.actor.Actor;

public abstract class ActorBuilder {

    protected static Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairStyle();

    public Actor construct() {
        this.buildCostume();
        this.buildFace();
        this.buildType();
        this.buildSex();
        this.buildHairStyle();
        return actor;
    }

}
