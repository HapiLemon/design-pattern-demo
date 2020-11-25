package org.example.prototype.deep;

import org.example.prototype.runoob.deep.Author;
import org.example.prototype.runoob.deep.Book;

import java.io.IOException;

public class DeepCloneTest {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Book book1 = new Book();
        Author author = new Author();
        author.setName("corn");
        author.setAge(100);
        book1.setAuthor(author);
        book1.setTitle("好记性不如烂博客");
        book1.setPageNum(230);

        Book book2 = book1.deepClone();

        System.out.println(book1 == book2);                                 // false
        System.out.println(book1.getPageNum() == book2.getPageNum());       // true 如果使用的是Integer则也会false
        System.out.println(book1.getTitle() == book2.getTitle());           // false
        System.out.println(book1.getAuthor() == book2.getAuthor());         // false

        // 深拷贝体现
        book1.getAuthor().setName("Bill");
        System.out.println(book2.getAuthor().getName());                    // corn

    }
}
