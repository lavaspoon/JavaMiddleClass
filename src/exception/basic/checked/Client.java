package exception.basic.checked;

/**
 * throw : 새로운 예외 발생. 예외도 객체이기 때문에 new 로 생성한다.
 * thorws : 발생시킨 예외를 메서드 밖으로 던질 때 사용
 */
public class Client {
    public void call() throws MyCheckedException {
        //문제 상황
        throw new MyCheckedException("MyCheckedException 발생");
    }
}
