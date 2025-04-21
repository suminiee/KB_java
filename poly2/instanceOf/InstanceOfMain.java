package poly2.instanceOf;

public class InstanceOfMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandChild = new GrandChild();

        //왼쪽이 오른쪽 클래스에 담길 수 있느냐에 대한 T/F가 뜸 -> instanceof
        //상속 관계 찾아주는게 instanceof
        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(grandChild instanceof Parent);
        System.out.println();
        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Child);
        System.out.println(grandChild instanceof Child);
        System.out.println();
        System.out.println(parent instanceof GrandChild);
        System.out.println(child instanceof GrandChild);
        System.out.println(grandChild instanceof GrandChild);
    }
}