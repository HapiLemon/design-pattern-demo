package command;

import executor.Executor;

/**
 * @author keminfeng
 * @date 2022-03-18 18:13
 */
public abstract class Command {

    protected Executor executor;

    public Command(Executor executor) {
        this.executor = executor;
    }

    public abstract void execute();

}
