package command;

/**
 * 负责调用执行方法
 */
public class Invoker {
    public void execute(Order order){
        order.execute();
    }
}
