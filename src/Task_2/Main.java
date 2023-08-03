package Task_2;

public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        DataOutput.getOutput(FilteringData.filterData(provider));
    }

}
