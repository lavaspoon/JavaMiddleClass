package ex.polymorphism.ex1;

public class AnimalSoundMain3 {

    public static void main(String[] args) {

        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (AbstractAnimal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("================");
        animal.sound();
        animal.move();
    }

}
