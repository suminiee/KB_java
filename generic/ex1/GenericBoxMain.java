package generic.ex1;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setValue(10);
        System.out.println(genericBox.getValue());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("woodz");
        System.out.println(stringBox.getValue());
    }
}
