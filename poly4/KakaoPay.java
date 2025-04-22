package poly4;

public class KakaoPay implements Pay{
    @Override
    public void pay(int amount) {
        System.out.println("connected with Kakao Pay system");
        System.out.println(amount + "원 만큼 결제를 시도합니다");
        System.out.println("결제 성공");
    }
}
