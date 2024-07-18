package ex.wrapper;

public class WrapperVsPrimitive {
    //기본형이 wrapper 보다 성능이 뛰어남을 증명
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i=0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        // Wrapper 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i=0; i < iterations; i++) {
            sumWrapper += i; //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

    }

}
