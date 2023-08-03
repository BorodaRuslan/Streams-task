package Task_1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataOutput {
    public static void getOutput(List<String> listName){
        AtomicInteger count = new AtomicInteger(0);
        listName.forEach(name -> System.out.println(count.incrementAndGet() + ") " + name));
    }
}

