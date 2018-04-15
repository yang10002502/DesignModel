package iteration;

import java.util.Map;

public class HandlerFactory{

    private AccommodationHandler accommodationHandler = new AccommodationHandler();
    private FoodCostHandler foodCostHandler = new FoodCostHandler();
    private TicketCostHandler ticketCostHandler = new TicketCostHandler();
    private TrafficCostHandler trafficCostHandler = new TrafficCostHandler();

    public BaseHandleIterator<HandlerContext, Map<String, Object>> getIterator(){
        BaseHandleIterator<HandlerContext, Map<String, Object>> iterators = new BaseHandleIterator<>();
        iterators.registerHandler(foodCostHandler);
        iterators.registerHandler(trafficCostHandler);
        iterators.registerHandler(ticketCostHandler);
        iterators.registerHandler(accommodationHandler);
        return iterators;
    }
}
