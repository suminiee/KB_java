package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod(); // 상속 받은 메서드

        System.out.println(child.toString());
        System.out.println(Integer.toHexString(child.hashCode())); //16진수형태로 주소 리턴..?
    }
}
