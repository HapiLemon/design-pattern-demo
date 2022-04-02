package org.example;

/**
 * @author keminfeng
 */
public class Tree extends AbstractTree{

    private final String type;

    public Tree(String type) {
        this.type = type;
    }
    
    @Override
    public void displayTreePosition() {
        System.out.print(type);
        showPosition();
    }
    
}
