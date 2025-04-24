package nested.inner;

public class InnerOuter {
    //static 유무 차이
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

     class Inner {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() {
            //클래스 내부의 static 값에 접근
            System.out.println("nestedStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            //클래스 내부의 non-static 값에 접근
            System.out.println("nestedInstance = " + nestedInstance);
            System.out.println("outerInstanxce = " + outerInstance); // 접근 불가

        }
    }
}
