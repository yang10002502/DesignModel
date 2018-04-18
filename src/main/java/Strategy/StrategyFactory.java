package Strategy;

/**
 * 策略工厂，根据context选择合适的策略返回
 */
public class StrategyFactory {

    public AbstractStrategy selectStrategy(Context context){
        //不同设备售卖不同的商品
        Integer vendorModel = context.getVendorModel();
        if(vendorModel.equals(1)){
            return new ModelOneStrategy();
        }else{
            return new ModelTwoStrategy();
        }
    }
}
