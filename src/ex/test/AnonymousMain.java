package ex.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = new Hello() {


            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        hello.sayHello();
    }
}
