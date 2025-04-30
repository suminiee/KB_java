package generic.limit;

public class World2 {
    public static void main(String[] args) {
        GenericWorld<Long> genericWorld1 = new GenericWorld<>();
        genericWorld1.setNumber(1L);
        genericWorld1.transDouble();
        System.out.println(genericWorld1.toString());
    }
}
