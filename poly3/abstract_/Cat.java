package poly3.abstract_;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("고양이는 야옹");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 츄르를 먹어용");
    }
}
