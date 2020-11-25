package org.example.prototype.shallow;

import org.example.prototype.runoob.shallow.Author;
import org.example.prototype.runoob.shallow.Book;

public class ShallowCloneTest {

    public static void main(String[] args) {
        Book book1 = new Book();
        Author author = new Author();
        author.setName("corn");
        author.setAge(100);
        book1.setAuthor(author);
        book1.setTitle("好记性不如烂博客");
        book1.setPageNum(230);

        Book book2 = book1.clone();

        System.out.println(book1 == book2);                             // false
        System.out.println(book1.getPageNum() == book2.getPageNum());   // true
        System.out.println(book1.getTitle() == book2.getTitle());       // true
        System.out.println(book1.getAuthor() == book2.getAuthor());     // true

        // 浅拷贝体现
        book1.getAuthor().setName("Bill");
        System.out.println(book2.getAuthor().getName());                // Bill
        // 浅拷贝会将引用数据类型(类，数组，接口)的地址复制来

    }

}
