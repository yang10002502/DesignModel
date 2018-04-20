package strategy;

/**
 * 具体的策略实体ModelOneStrategy
 */
public class ModelOneStrategy extends AbstractStrategy {

    /**
     * 不同的策略具体实现方法
     * @param context
     */
    @Override
    public void saleGroup(Context context) {
        System.out.println("model one sale group is " + context.getGroupName());
    }
}
