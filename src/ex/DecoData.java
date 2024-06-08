package ex;

public class DecoData {

    private int instanceValue;
    private static int staticValue; //컴파일 시점에 생성됨

    /**
     * static 함수는 static 변수만 선언 가능하다.
     * 인스턴스 변수는 컴파일 시점에 생성되는 변수가 아니기 때문
     */
    public static void staticCall() {

        //instanceValue++; 인스턴스 변수 접근, compile error
        //instanceMethod(); 인스턴스 메서드 접근, compile error -> 컴파일 시점에 만들어지는 메서드가 아니기 때문에 에러발생

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        DecoData.staticValue++;
        DecoData.staticMethod(); //DecoData 생략가능 (본인 클래스여서)
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
