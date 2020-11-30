package org.example.builder.book;

import org.example.builder.simplify.actor.Actor;
import org.example.builder.simplify.builder.ActorBuilder;
import org.example.builder.simplify.utils.XMLUtil;

public class BuilderPatternSimplifyTest {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = (ActorBuilder) XMLUtil.getBean();
        Actor actor = actorBuilder.construct();

        System.out.println(actor.toString());

    }
}
