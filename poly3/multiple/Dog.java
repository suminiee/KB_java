package poly3.multiple;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("사료");
    }

    @Override
    public void sleep() {
        System.out.println("쿨쿨띠예");
    }
}
