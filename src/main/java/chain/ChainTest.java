package chain;

import org.junit.jupiter.api.Test;

/**
 * 验证测试类
 */
public class ChainTest {

    @Test
    public void testErrorLever(){
        Context context = new Context(LoggerLever.ERROR,"错误信息");
        AbstractLogger logger = LoggerFactory.getLogger();
        logger.logMessage(context);
    }

    /**
     * 责任链的弊端，存在没有任何实体处理
     */
    @Test
    public void testDefaultLever(){
        Context context = new Context(LoggerLever.DEFAULT,"默认信息");
        AbstractLogger logger = LoggerFactory.getLogger();
        logger.logMessage(context);
    }
}
