package assign2.exam05;

public class Exam05 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    Exam05() {

    }
    Exam05(String model) {
        this.model = model;
    }
    Exam05(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Exam05(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
