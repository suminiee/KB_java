package exception.basic;

public class ExceptionFinal2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        try {
            accessArr(arr, 5);
            Object obj = null;
//            accessNull(obj);

//            obj.equals(arr);
            System.out.println(arr[5]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("정말 실행하고 싶은 프로그램");
        }

    }
    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
