package chain;

/**
 * 记录日志的工厂
 */
public class LoggerFactory {

    public static AbstractLogger getLogger(){
        return new InfoLogger();
    }
}
