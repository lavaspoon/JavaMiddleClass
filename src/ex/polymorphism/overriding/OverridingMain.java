package ex.polymorphism.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child(); //Child -> [Parent, Child]
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println("======================");

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent(); //Parent -> [Parent]
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        System.out.println("======================");

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //Child -> [Parent, Child]
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩 X
        poly.method(); //메소드는 오버라이딩 O


        System.out.println("======================");
        System.out.println("타입 테스트");
        System.out.println(parent instanceof Child); //Parent -> [Parent]
        System.out.println(child instanceof Parent); //Child -> [Parent, Child]
        System.out.println(poly instanceof Parent); //Child -> [Parent, Child]
        System.out.println(poly instanceof Child); //Child -> [Parent, Child]
    }
}
