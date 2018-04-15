package iteration;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

public class IterationModelTest {

    @Test
    public void test() throws Exception{
        HandlerContext context = new HandlerContext();
        context.setBudget(BigDecimal.valueOf(1500));
        HandlerFactory factory = new HandlerFactory();
        BaseHandleIterator<HandlerContext, Map<String, Object>> iterator = factory.getIterator();
        Map<String, Object> result = iterator.doNextHandler(context);
        System.out.println(result.get("info"));
    }
}
