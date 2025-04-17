package inheritance;

public class GasCar extends Car {
    @Override
    public void move() {
        System.out.println("휘발유 차를 이동합니다.");
    }

    @Override
    public void openDoor() {
        System.out.println("휘발유 차 문을 엽니다");
    }

    public void fillUp() {
        System.out.println("휘발유를 주유합니다.");
    }
}
