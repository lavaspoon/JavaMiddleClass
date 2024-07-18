package ex.polymorphism.ex2;

import ex.polymorphism.ex1.Cat;
import ex.polymorphism.ex1.Caw;
import ex.polymorphism.ex1.Dog;
import ex.polymorphism.ex1.Duck;
import ex.polymorphism.ex1.*;

public class AnimalSoundMain1 {

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
