package Task_3;

public class Main {
    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataOutput.getOutput(FilteringData.filterData(provider));

    }


}
