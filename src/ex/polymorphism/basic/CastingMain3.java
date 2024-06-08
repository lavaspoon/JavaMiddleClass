package ex.polymorphism.basic;

//업캐스팅 vs 다운캐스팅
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능함 (Parent) child
        Parent parent2 = child; //업캐스팅 생략

        parent1.parentMethos();
        parent2.parentMethos();
    }
}
