package Task_1;

import java.util.List;

public class FilteringData {
    public static List<String> filterData(DataProvider provider){
        return provider.getData()
                .stream()
                .filter(name -> name.startsWith("А"))
                .toList();
    }
}
