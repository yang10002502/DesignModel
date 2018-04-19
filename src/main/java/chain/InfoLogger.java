package chain;

/**
 * 责任链处理元素实体，等级最低
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(){
        lever = LoggerLever.INFO;
        nextLogger = new WarningLogger();
    }

    public InfoLogger(LoggerLever lever, AbstractLogger nextLogger) {
        super(lever, nextLogger);
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("InfoLogger out the message :"+msg);
    }
}
