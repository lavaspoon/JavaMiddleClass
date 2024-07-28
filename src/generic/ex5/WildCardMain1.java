package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("야옹", 50));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        Dog dog = WildCardEx.<Dog>printAndReturnGeneric(dogBox);
        Cat cat = WildCardEx.<Cat>printAndReturnGeneric(catBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
    }
}
