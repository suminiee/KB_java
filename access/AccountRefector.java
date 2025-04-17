package access;

public class AccountRefector {
    private int total;
    public String bank;
    String grade; //이게 default
    private String name;

    public int getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    //cmd + n -> constructor : 생성자 자동으로 만들어줌
    public AccountRefector(int total, String bank, String grade, String name) {
        this.total = total;
        this.bank = bank;
        this.grade = grade;
        this.name = name;
    }

    void deposit(int amount) {
        total += amount;
    }

    void withdraw(int amount) {
        total -= amount;
    }
}
