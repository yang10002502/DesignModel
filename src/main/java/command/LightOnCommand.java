package command;

/**
 * 命令的实体
 */
public class LightOnCommand implements Order {

    private Receiver receiver;

    public LightOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnON();
    }
}
