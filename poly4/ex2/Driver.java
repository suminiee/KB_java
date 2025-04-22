package poly4.ex2;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner sc = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar() {
        System.out.print("운전하고 싶은 차를 선택하세요 (1. K5 / 2. 그랜져) : ");
        if (sc.nextInt() == 1) {
            setCar(new K5Car());
        } else {
            setCar(new GrandeurCar());
        }
        drive();
        sc.close();
    }

    public void drive() {
        car.drive();
    }
}
