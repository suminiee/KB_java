package access;

public class Account {
    int total;
    Account(int init) {
        total = init;
    }

    void deposit(int amount) {
        total += amount;
    }

    void withdraw(int amount) {
        total -= amount;
    }
}
