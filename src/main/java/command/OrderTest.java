package command;

import org.junit.jupiter.api.Test;

/**
 * 命令模式测试类
 */
public class OrderTest {

    @Test
    public void test(){
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Order turnOnLight = new LightOnCommand(receiver);
        Order turnOffLight = new LightOffCommand(receiver);

        invoker.execute(turnOnLight);
        invoker.execute(turnOffLight);
    }
}
