package generic.ex2;

public class StrictGenericBoxMain {
    public static void main(String[] args) {
        StrictGenericBox<String> stringStrictGenericBox = new StrictGenericBox<>();
        stringStrictGenericBox.setValue("Hello world!");
        System.out.println(stringStrictGenericBox.getValue());

        StrictGenericBox<Character> characterStrictGenericBox = new StrictGenericBox<>();
        characterStrictGenericBox.setValue('a');
        System.out.println(characterStrictGenericBox.getValue());
    }
}
