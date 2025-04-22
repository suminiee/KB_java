package poly4;

public class PaySystem {
    Pay pay;
    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
        pay.pay(amount);
    }
}
