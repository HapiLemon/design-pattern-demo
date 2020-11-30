package org.example.builder.book;

import org.example.builder.book.builder.ActorBuilder;
import org.example.builder.book.utils.XMLUtil;

public class BuilderPatternTest {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = (ActorBuilder)XMLUtil.getBean();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);

        System.out.println(actor.toString());

    }
}
