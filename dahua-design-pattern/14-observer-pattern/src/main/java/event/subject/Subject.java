package event.subject;

import event.Event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-23 16:28
 */
public abstract class Subject {

    private final List<Event> observerList = new ArrayList<>();

    public void attachObserver(String methodName,Object targetObj, Object[] params) {
        this.observerList.add(new Event(methodName, targetObj, params));
    }
    
    public void notifyObservers() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        for (Event event : this.observerList) {
            event.invoke();
        }
    }
    
}
