package generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer value = GenericMethod.<Integer>genericMethod(10);
        //추론이 가능해서(10이 Integer라서 java가 추론이 가능함)
        Integer value2 = GenericMethod.genericMethod(10);
        System.out.println(value);

//        GenericMethod.<String>genericMethod(10);
    }
}
