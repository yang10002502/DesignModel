package command;

/**
 * 命令的实体
 */
public class LightOffCommand implements Order{

    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOFF();
    }
}