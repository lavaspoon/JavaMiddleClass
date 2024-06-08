package ex;

public class Parent {

    public String value = "parent";

    /**
     * 상속관계의 인스턴스 생성하면 결국 메모리 내부에는 자식과 부모 클래스가 각각 만들어진다.
     * Child를 만들면 부모인 Parent까지 함께 만들어지는 것이다.
     * 따라서 각각의 생성자도 모두 호출 되어야 한다.
     * -> 상속관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야한다.(규칙)
     * 부모 super() 생성자 생략가능
     */
    public Parent() {
        System.out.println("부모생성자 실행");
    }

    public Parent(String value) {
        System.out.println("부모생성자 실행[오버로딩]:" + value);
    }

    public void hello() {
        System.out.println("Parent.hello");
    }
}
