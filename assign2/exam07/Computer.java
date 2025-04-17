package assign2.exam07;

public class Computer {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    int sum(int[] value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }

}
