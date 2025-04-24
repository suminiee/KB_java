package nested.static_;

public class StaticOuterMain {
    public static void main(String[] args) {
        StaticOuter staticOuter = new StaticOuter();
        StaticOuter.nested nested = new StaticOuter.nested();
        nested.print();


    }
}
