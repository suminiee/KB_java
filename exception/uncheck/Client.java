package exception.uncheck;

public class Client {
    public void callUncheckException() {
        throw new MyUncheckException("Client callException에서 발생");
    }
}
