package nested.anonymous;

public class AnonymousOuter2 {
    private String outerInstance = "outerInstance";


    public void outerMethod() {
        String methodString = "methodString";

        Print print = new Print() {
            @Override
            public void printLocal() {
                System.out.println(outerInstance);
                System.out.println(methodString);
            }
        };

        print.printLocal();
    }

    public static void main(String[] args) {
        AnonymousOuter2 anonymousOuter = new AnonymousOuter2();
        anonymousOuter.outerMethod();
    }
}
