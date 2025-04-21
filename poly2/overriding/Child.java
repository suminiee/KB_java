package poly2.overriding;
public class Child extends Parent {
    public String value = "child";

    //부모의 method 재정의 -> override
    @Override
    public void method() {
        System.out.println("child method");
    }
}
