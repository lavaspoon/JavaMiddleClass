package ex.polymorphism.ex2;

public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소가 움직인다.");
    }
}
