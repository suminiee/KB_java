package assign2.exam11;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result1 = 10 * 10 * c.pi; // 원의 넓이
        int result2 = c.plus(10, 5) ; // 10, 5의 합
        int result3 = c.minus(10, 5); // 10, 5의 차
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

    }
}
