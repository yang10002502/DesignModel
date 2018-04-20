package strategy;

/**
 * 测试类
 */
public class StrategyTest {

    public static void main(String[] args){
        Context context = new Context(2,"小熊饼干");
        StrategyFactory factory = new StrategyFactory();
        AbstractStrategy strategy = factory.selectStrategy(context);
        strategy.saleGroup(context);
    }
}
