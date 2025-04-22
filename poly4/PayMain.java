package poly4;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner sc = new Scanner(System.in);

        int option;
        int amount;

        System.out.print("결제 옵션을 입력하세요 (1. KB pay / 2. Kakao pay / 3. Naver pay) : ");
        option = sc.nextInt();
        System.out.print("결제 금액을 입력하세요 : ");
        amount = sc.nextInt();

        switch (option) {
            case 1 :
                paySystem.setPay(new KBPay());
                break;
            case 2:
                paySystem.setPay(new KakaoPay());
                break;
            case 3:
                paySystem.setPay(new NaverPay());
                break;
        }

        paySystem.payment(amount);

        sc.close();
    }
}
