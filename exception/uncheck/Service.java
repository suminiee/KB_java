package exception.uncheck;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.callUncheckException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("막았는가");
    }
}
