package ex.polymorphism.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child(); // 메모리 -> [Parent, Child]
        Child child1 = (Child) parent1;

        child1.childMethod();

        Parent parent2 = new Parent(); // 메모리 -> [Parent]
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException -> 메모리에 Child가 없기 때문에, 다운캐스팅이 불가하다.

        child2.childMethod(); //실행불가
    }

}
