package Task_3;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    public Map<String, Integer> getData() {
        Map<String, Integer> weather = new HashMap<>();
        weather.put("Monday", 11);
        weather.put("Tuesday", 8);
        weather.put("Wednesday", 9);
        weather.put("Thursday", 10);
        weather.put("Friday", 12);
        weather.put("Saturday", 18);
        weather.put("Sunday", 15);
        return weather;
    }
}
