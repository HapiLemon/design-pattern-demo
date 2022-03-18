package invoker;

import command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminfeng
 * @date 2022-03-18 18:20
 */
public class Waiter {

    private final List<Command> commandList = new ArrayList<>();

    public void orderJuice(Command command) {
        this.commandList.add(command);
    }

    public void cancelOrder(Command command) {
        this.commandList.remove(command);
    }

    public void done() {
        for (Command command : commandList) {
            command.execute();
        }
    }

}
