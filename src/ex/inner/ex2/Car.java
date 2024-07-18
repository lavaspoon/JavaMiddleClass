package ex.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    //내부 클래스는 각 인스턴스에 접근 가능
    public class Engine {

        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel); //바깥 클래스 접근 가능
            System.out.println(model + "의 엔진을 구동합니다."); //바깥 클래스 접근 가능
        }
    }

}
