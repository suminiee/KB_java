package exception.check;
public class Client {
    public void callCheckException() throws MyCheckException {
        MyCheckException exception = new MyCheckException("Client callCheckException에서 발생");
        throw exception;
    }

    public void callRandException(boolean check) throws MyCheckException2 {

        if (check) {
            throw new MyCheckException2("오늘은 운이 없으시군요");
        } else {
            System.out.println("오늘은 운이 좋으시군요");
        }

    }
}
