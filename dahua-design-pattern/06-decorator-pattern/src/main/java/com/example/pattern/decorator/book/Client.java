package com.example.pattern.decorator.book;

import com.example.pattern.decorator.book.component.AbstractPerson;
import com.example.pattern.decorator.book.concretecomponent.Person;
import com.example.pattern.decorator.book.decorator.*;

/**
 * @author keminfeng
 * @date 2022-01-26 18:05
 */
public class Client {
    public static void main(String[] args) {
        AbstractPerson bill = new Person("Bill");
        bill = new TShirt(bill);
        bill = new BigTrouser(bill);
        bill = new Sneaker(bill);
        System.out.println(bill.show() + " 一共" + bill.getFineryCount() + "件衣服");

        AbstractPerson bob = new Person("Bob");
        bob = new Shirt(bob);
        bob = new Jeans(bob);
        bob = new Canvas(bob);
        System.out.println(bob.show() + " 一共" + bob.getFineryCount() + "件衣服");
    }
}
