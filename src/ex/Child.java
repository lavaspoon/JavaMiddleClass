package ex;

public class Child extends Parent {

    public String value = "child";

    public Child() {
        super(); //부모 생성자 -> 생략가능
        System.out.println("자식생성자 실행");
    }

    public Child(String value) {
        //super(); //부모 생성자 -> 생략가능
        super("test"); //생략불가
        System.out.println("자식생성자 실행[오버로딩]:" + value);
    }

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();
    }
}
