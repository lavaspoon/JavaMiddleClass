package ex;

public class Super1Main {

    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child("test");
        child1.call();
    }
}
