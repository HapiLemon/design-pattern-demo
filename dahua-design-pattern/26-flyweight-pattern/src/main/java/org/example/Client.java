package org.example;

/**
 * @author keminfeng
 */
public class Client {
    public static void main(String[] args) {
        Planter planter = new Planter();
        planter.plantTree("apple tree", 10, 15);
        planter.plantTree("apple tree", 10, 20);
        planter.plantTree("banana tree", 15, 15);
        planter.plantTree("orange tree", 20, 15);
        planter.plantTree("banana tree", 15, 20);
    }
}
