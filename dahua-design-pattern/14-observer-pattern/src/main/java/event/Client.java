package event;

import event.observer.Parent;
import event.observer.Student;
import event.subject.Teacher;

import java.lang.reflect.InvocationTargetException;

/**
 * @author keminfeng
 * @date 2022-02-23 16:35
 */
public class Client {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Teacher teacher = new Teacher("老师");

        Student bill = new Student("Bill", 28.1);
        Student bob = new Student("Bob", 63.5);

        Parent parent = new Parent();

        teacher.attachObserver("speak", bill, null);
        teacher.attachObserver("speak", bob, null);
        teacher.attachObserver("phoneNotice", parent, new Object[]{bill});
        teacher.attachObserver("phoneNotice", parent, new Object[]{bob});

        teacher.notifyObservers();
    }
}
