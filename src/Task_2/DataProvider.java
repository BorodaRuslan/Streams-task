package Task_2;

import java.util.HashMap;
import java.util.Map;
public class DataProvider {

    public  Map<String, Double> getData(){
        Map<String, Double> products = new HashMap<>();
        products.put("Potato", 2.4);
        products.put("Cucumbers", 1.8);
        products.put("Cabbage", 2.0);
        products.put("Carrot", 3.1);
        products.put("Onion", 3.4);
        products.put("Apples", 1.9);
        return products;
    }
}
