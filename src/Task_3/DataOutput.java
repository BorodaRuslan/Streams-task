package Task_3;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataOutput {

    public static void getOutput(Map<String, Integer> dataWeather){
        AtomicInteger count = new AtomicInteger(0);
        dataWeather.forEach((key, value) ->
                System.out.println(count.incrementAndGet()
                + ") " + key + " temperature: " + value));
    }
}
