package ex.polymorphism.ex1;

public class AnimalSoundMain2 {

    public static void main(String[] args) {

        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        for (AbstractAnimal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
