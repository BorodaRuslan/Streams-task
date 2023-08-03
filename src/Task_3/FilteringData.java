package Task_3;

import java.util.Map;
import java.util.stream.Collectors;

public class FilteringData {
    public static Map<String, Integer> filterData(DataProvider provider) {
        return provider.getData()
                .entrySet()
                .stream()
                .filter(w -> w.getValue() > 10 && w.getValue() <= 13)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
