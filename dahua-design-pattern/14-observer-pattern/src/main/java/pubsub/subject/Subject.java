package pubsub.subject;

import pubsub.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminfeng
 * @date 2022-02-23 16:02
 */
public abstract class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }
    
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }
    
    public void sendNotice() {
        for (Observer observer : observerList) {
            observer.receiveNotice();
        }
    }
}
