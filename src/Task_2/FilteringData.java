package Task_2;

import java.util.Map;
import java.util.stream.Collectors;

public class FilteringData {
    public static Map<String, Double> filterData(DataProvider provider){
        return provider.getData()
                .entrySet()
                .stream()
                .filter(price -> price.getValue() <= 2.0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
