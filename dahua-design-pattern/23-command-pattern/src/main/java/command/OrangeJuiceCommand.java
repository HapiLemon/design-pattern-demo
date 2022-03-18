package command;


import executor.Executor;

/**
 * @author keminfeng
 * @date 2022-03-18 18:19
 */
public class OrangeJuiceCommand extends Command {

    public OrangeJuiceCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        this.executor.makeOrangeJuice();
    }
}
