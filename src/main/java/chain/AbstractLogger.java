package chain;

public abstract class AbstractLogger {
    private LoggerLever lever;

    private AbstractLogger nextLogger;

    public void logMessage(LoggerLever lever, String msg) {
        if (this.lever.equals(lever)) {
            writeMsg(msg);
        } else {
            nextLogger.logMessage(lever, msg);
        }

    }

    public abstract void writeMsg(String msg);

    public AbstractLogger(LoggerLever lever, AbstractLogger nextLogger) {
        this.lever = lever;
        this.nextLogger = nextLogger;
    }

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
