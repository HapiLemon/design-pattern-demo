package event.observer;

/**
 * @author keminfeng
 * @date 2022-02-23 16:34
 */
public class Parent {

    public void phoneNotice(Student student) {
        System.out.println(student.getName() + "考试分数" + student.getScore());
    }
    
}
