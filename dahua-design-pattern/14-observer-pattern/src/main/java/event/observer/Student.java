package event.observer;

import lombok.Data;

/**
 * @author keminfeng
 * @date 2022-02-23 16:33
 */
@Data
public class Student {

    private String name;

    private Double score;

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public void speak() {
        System.out.println(name + "考试分数" + score);
    }
    
}
