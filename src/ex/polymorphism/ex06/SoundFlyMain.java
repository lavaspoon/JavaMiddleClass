package ex.polymorphism.ex06;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("=======");
        animal.sound();
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("=======");
        fly.fly();
    }

}
