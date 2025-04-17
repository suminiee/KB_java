package assign2.exam10;

public class Car {
    //필드 선언
    String model;
    int speed;

    Car (String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
//        xxx(model 값)가 달립니다.(시속: yyy(speed 값)km/h)
        System.out.println(model + "이/가 달립니다.(시속: " + speed + "km/h)");

    }
}