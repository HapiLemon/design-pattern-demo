package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author keminfeng
 */
public class Planter {

    private final Map<String, AbstractTree> map = new HashMap<>();

    public void plantTree(String treeType, int x, int y) {
        AbstractTree tree = getTree(treeType);
        tree.setX(x);
        tree.setY(y);
        tree.displayTreePosition();
    }

    private AbstractTree getTree(String treeType) {
        AbstractTree abstractTree = this.map.get(treeType);
        if (abstractTree == null) {
            System.out.println("Construct a new tree " + treeType);
            Tree tree = new Tree(treeType);
            this.map.put(treeType, tree);
            abstractTree = tree;
        }
        return abstractTree;
    }

}
