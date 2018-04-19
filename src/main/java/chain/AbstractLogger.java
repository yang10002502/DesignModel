package chain;

/**
 * 责任链处理元素抽象类
 */
public abstract class AbstractLogger {
    protected LoggerLever lever;

    protected AbstractLogger nextLogger;

    public AbstractLogger() {
    }

    public AbstractLogger(LoggerLever lever, AbstractLogger nextLogger) {
        this.lever = lever;
        this.nextLogger = nextLogger;
    }

    public void logMessage(Context context) {
        if (this.lever.equals(context.getLever())) {
            writeMsg(context.getMsg());
        } else if (nextLogger != null) {
            nextLogger.logMessage(context);
        }
    }

    public abstract void writeMsg(String msg);



    public LoggerLever getLever() {
        return lever;
    }

    public void setLever(LoggerLever lever) {
        this.lever = lever;
    }

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

}
