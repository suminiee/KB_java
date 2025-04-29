package exception.check;

import java.util.Random;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callCheckException();
            Random random = new Random();
            client.callRandException(random.nextBoolean());
        } catch (MyCheckException2 | MyCheckException e) {
            e.printStackTrace();
        }
    }
}
