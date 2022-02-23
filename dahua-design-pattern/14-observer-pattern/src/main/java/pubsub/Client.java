package pubsub;

import pubsub.observer.Parent;
import pubsub.observer.Student;
import pubsub.subject.Teacher;

/**
 * @author keminfeng
 * @date 2022-02-23 16:07
 */
public class Client {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setName("Bill");

        Student student = new Student();
        student.setName("Bob");
        
        Teacher teacher = new Teacher();
        teacher.attach(parent);
        teacher.attach(student);
        System.out.println("第一次通知");
        teacher.sendNotice();

        teacher.detach(parent);
        System.out.println("第二次通知");
        teacher.sendNotice();
    }
}
