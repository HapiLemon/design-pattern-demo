package pubsub.observer;

import lombok.Data;

/**
 * @author keminfeng
 * @date 2022-02-23 16:02
 */
@Data
public abstract class Observer {
    
    private String name;

    public abstract void receiveNotice();
}
