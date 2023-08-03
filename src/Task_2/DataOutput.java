package Task_2;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataOutput {
    public static void getOutput(Map<String, Double> dataMap) {
        AtomicInteger count = new AtomicInteger(0);
        dataMap.forEach((key, value) ->
                System.out.println(count.incrementAndGet()
                        + ") " + key + " price: " + value + " $"));
    }
}
