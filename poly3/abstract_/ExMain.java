package poly3.abstract_;

public class ExMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = { new Dog(), new Cat(), new Duck() };

        for (AbstractAnimal animal : animals) {
            animalCall(animal);
        }
    }

    public static void animalCall(AbstractAnimal animal) {
        animal.sound();
        animal.eat();
        if (animal instanceof Duck) {
            ((Duck) animal).fly();
        }
    }
}
