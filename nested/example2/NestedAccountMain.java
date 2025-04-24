package nested.example2;


public class NestedAccountMain {
    public static void main(String[] args) {
       Account account = new Account("이효석", 1000);
       Account account1 = new Account("조승연", 202000);

       Account.StaticAccountStatus.showStatus();
       account1.showInnerStatus();
    }
}
