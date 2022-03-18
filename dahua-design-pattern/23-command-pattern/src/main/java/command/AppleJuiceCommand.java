package command;

import executor.Executor;

/**
 * @author keminfeng
 * @date 2022-03-18 18:18
 */
public class AppleJuiceCommand extends Command {

    public AppleJuiceCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        this.executor.makeAppleJuice();
    }
}
