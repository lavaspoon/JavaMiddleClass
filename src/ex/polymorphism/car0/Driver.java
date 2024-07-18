package ex.polymorphism.car0;

public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngin();
            k3Car.offEngin();
            k3Car.pressAccelerator();
        } else if (model3Car != null) {
            model3Car.startEngin();
            model3Car.offEngin();
            model3Car.pressAccelerator();
        }
    }

}
