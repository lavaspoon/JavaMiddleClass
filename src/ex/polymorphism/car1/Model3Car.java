package ex.polymorphism.car1;

public class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Model3Car.start");
    }

    @Override
    public void offEngine() {

    }

    @Override
    public void pressAccelator() {

    }
}
