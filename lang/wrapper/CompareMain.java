package lang.wrapper;

public class CompareMain {
    public static void main(String[] args) {
        Integer integer1 = 10;
        Integer integer2 = Integer.valueOf(10);

        Long long1 = 100L;
        Long long2 = Long.valueOf(100L);

        int intValue1 = integer1.intValue();
        int intValue2 = integer1;

        long longValue1 = long1.longValue();
        long longValue2 = long1;


    }
}
