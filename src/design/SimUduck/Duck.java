package design.SimUduck;

public interface Duck {
    private void quack() {
        System.out.println("꽥꽥");
    };
    private void swim() {
        System.out.println("수영하다.");
    };
    void display();
}
