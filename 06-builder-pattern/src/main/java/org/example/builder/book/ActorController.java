package org.example.builder.book;

import org.example.builder.book.builder.ActorBuilder;

public class ActorController {

    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        // 调用钩子
        if (!actorBuilder.isBareheaded()) {
            actorBuilder.buildHairStyle();
        }
        actor=actorBuilder.createActor();
        return actor;
    }
}
