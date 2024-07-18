package ex.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    //정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근 (static은 바깥 인스턴스 접근 X)
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버 접근 (private이라고 할지라도, 정적 변수는 어디서나 접근 가능함)
            System.out.println(outClassValue);
        }
    }
}
