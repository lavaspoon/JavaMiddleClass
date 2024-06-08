package ex.polymorphism.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        System.out.println("==parent1 호출==");
        call(parent1);
        System.out.println("==parent2 호출==");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethos();
        if (parent instanceof Child) { //다운캐스팅 해도 안전한 경우
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }

}
