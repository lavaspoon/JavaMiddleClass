package ex.polymorphism.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; //poly의 x001을 child에 대입 -> 자식은 부모타입을 품을 수 없다. -> 경고를 무시하고, 다운캐스팅 (기존 poly 변수는 Parent 타입을 그대로 유지됨) -> Child child = x001; (참조값)
        child.parentMethos();
        child.childMethod();


    }

}
