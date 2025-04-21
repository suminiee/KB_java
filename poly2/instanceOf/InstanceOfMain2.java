package poly2.instanceOf;

public class InstanceOfMain2 {
    public static void main(String[] args) {
        Parent[] family = {new Parent(), new Child(), new GrandChild()};

        for (Parent p : family) {
            testInstanceOf(p);
        }
    }

    static void testInstanceOf(Parent p) {
        p.parentMethod();

        //child의 상속을 받았는지 확인
        if (p instanceof Child) {
            System.out.println("매개 변수로 들어온 P가 Child의 인스턴스가 맞음!");
            ((Child) p).childMehtod();
        }
        if (p instanceof GrandChild) {
            System.out.println("매개 변수로 들어온 P가 GrandChild의 인스턴스가 맞음!");
            ((GrandChild) p).grandChildMehtod();
        }
    }
}
