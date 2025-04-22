package poly4.ex2;

import java.util.Scanner;

public class GrandeurCar implements Car{
    int fuel = 0;
    int efficiency = 1;

    @Override
    public void fillFuel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주유할 기름의 양을 입력하세요 : ");
        this.fuel = sc.nextInt();
    }

    @Override
    public void openDoor() {
        System.out.println("그랜져 차 문을 엽니다.");
    }

    @Override
    public void drive() {
        fillFuel();
        openDoor();
        System.out.println("주행을 시작합니다.");
        System.out.println("그랜져는 총 " + efficiency * fuel + "만큼 달렸습니다.");
        System.out.println("그랜져 운행 종료");

    }
}
