package chain;

/**
 * 责任链处理元素实体，等级居中
 */
public class WarningLogger extends AbstractLogger{

    public WarningLogger() {
        lever = LoggerLever.WARNING;
        nextLogger = new ErrorLogger();
    }

    public WarningLogger(LoggerLever lever, AbstractLogger nextLogger) {
        super(lever, nextLogger);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("WarningLogger out the message is : "+msg);
    }
}
