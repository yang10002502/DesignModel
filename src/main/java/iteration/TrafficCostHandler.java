package iteration;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static iteration.CostConstant.TRAFFIC_COST;
import static iteration.CostConstant.TRAFFIC_COST_INFO;

public class TrafficCostHandler implements BaseHandler<HandlerContext,Map<String,Object>> {
    @Override
    public Map<String, Object> handle(BaseHandleIterator<HandlerContext, Map<String, Object>> iterator, HandlerContext context) throws Exception {
        BigDecimal free = Optional.ofNullable(context.getFree()).orElse(context.getBudget());
        if(TRAFFIC_COST.compareTo(free) > 0){
            Map<String, Object> result = new HashMap<>();
            result.put("status",false);
            result.put("info","花费不够，请增加预算");
            return result;
        }

        BigDecimal cost = Optional.ofNullable(context.getCost()).orElse(BigDecimal.ZERO);
        String detail = Optional.ofNullable(context.getDetail()).orElse("");

        context.setCost(cost.add(TRAFFIC_COST));
        context.setFree(free.subtract(TRAFFIC_COST));
        context.setDetail(detail+ MessageFormat.format(TRAFFIC_COST_INFO,TRAFFIC_COST));

        if(iterator.hasNext()){
            return iterator.doNextHandler(context);
        } else{
            Map<String, Object> result = new HashMap<>();
            result.put("status",true);
            result.put("info",context);
            return result;
        }
    }
}
