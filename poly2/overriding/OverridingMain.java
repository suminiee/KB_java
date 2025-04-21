package poly2.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println("Parent value : " + parent.value);
        parent.method();

        Child child = new Child();
        System.out.println("Child value : " + child.value);
        child.method();

        Parent poly = new Child();
        System.out.println("Poly value : " + poly.value);
        //overriding이 되면 우선순위가 먼저...가돼서 child method가 뜨게 됨.
        poly.method();
    }
}
