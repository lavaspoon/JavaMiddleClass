package ex.polymorphism.ex1;

public class Duck extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 움직인다.");
    }
}
