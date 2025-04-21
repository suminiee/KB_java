package poly2.casting;

public class CastingMain {
    public static void main(String[] args) {
//        Child child = new Child();
//
//        child.childMethod();
//        child.parentMethod();

        Parent parent = new Child();
        parent.parentMethod();

        //임시로 child로 캐스팅(형변환)을 해야함
//        Child poly = (Child) parent;
        ((Child) parent).childMethod();
//        poly.childMethod();
    }
}
