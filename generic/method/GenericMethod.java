package generic.method;

public class GenericMethod {
    //method type 제한 + method 에 generic 사용하기
    public static <T extends Number> T genericMethod(T t) {
        System.out.println("GenericMethod : " + t);
        return t;
    }
}
