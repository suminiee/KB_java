package poly3.multiple;

public class SooMain {
    public static void main(String[] args) {
//        Soo soo = new Soo();
//        Animal dog = new Dog();
//
//        animalDo(dog);
//        animalDo(soo);
//
//        humanDo(soo);

        Animal[] animals = {new Dog(), new Soo()};
        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);
            if(animals[i] instanceof Human) {
                humanDo((Human) animals[i]);
            }
        }
    }

    public static void animalDo(Animal animal) {
        System.out.println("동물 기능 테스트");
        animal.eat();
        animal.sleep();
        System.out.println("동물 기능 테스트 종료");
    }

    public static void humanDo(Human human) {
        System.out.println("인간 기능 테스트");
        human.think();
        System.out.println("인간 기능 테스트 종료");
    }

}
