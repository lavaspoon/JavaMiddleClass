package ex.polymorphism.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("[Parent -> Parent]");
        Parent parent = new Parent();
        parent.parentMethos();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("[Child -> Child]");
        Child child = new Child();
        child.parentMethos();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("[Parent -> Child]");
        Parent poly = new Child(); //부모타입인데 자식을 넣었음
        poly.parentMethos();
        //poly.childMethod(); 호출 불가 -> Parent 타입은 본인만 알고 있다.
    }

}
