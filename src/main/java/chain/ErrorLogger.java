package chain;

/**
 * 责任链处理元素实体，等级最高
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        lever = LoggerLever.ERROR;
    }

    public ErrorLogger(LoggerLever lever, AbstractLogger nextLogger) {
        super(lever, nextLogger);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("ErrorLogger out the message is "+msg);
    }

}
