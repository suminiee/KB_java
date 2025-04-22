package poly3.multiple;

public class Soo implements Animal, Human{
    @Override
    public void eat() {
        System.out.println("밥먹음");
    }

    @Override
    public void sleep() {
        System.out.println("개졸림 자고싶음");
    }

    @Override
    public void think() {
        System.out.println("나는생각하는중임");
    }
}
