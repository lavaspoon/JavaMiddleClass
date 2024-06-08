package ex;

import static ex.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();


        //메서드 영역의 staticValue 값을 증가
        //힙 영역의 instanceValue 값을 증가
        System.out.println("2. 인스턴스 호출1");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();
    }
}
