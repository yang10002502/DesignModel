package chain;

/**
 * 待处理的信息
 */
public class Context {
    private LoggerLever lever;
    private String msg;

    public Context() {
    }

    public Context(LoggerLever lever, String msg) {
        this.lever = lever;
        this.msg = msg;
    }

    public LoggerLever getLever() {
        return lever;
    }

    public void setLever(LoggerLever lever) {
        this.lever = lever;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
