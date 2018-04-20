package strategy;

/**
 * 具体的策略实体ModelTwoStrategy
 */
public class ModelTwoStrategy extends AbstractStrategy {

    /**
     * 不同的策略具体实现方法
     * @param context
     */
    @Override
    public void saleGroup(Context context) {
        System.out.println("model two sale group is " + context.getGroupName());
    }
}
