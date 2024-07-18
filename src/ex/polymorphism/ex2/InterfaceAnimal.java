package ex.polymorphism.ex2;

/**
 * 인터페이스는 추상클래스와 똑같은데, 편의 기능이 추가된다.
 *
 * + 인터페이스의 메서드는 모두 public, abstract 이다.
 * + 메서드에 public abstract를 생략할 수 있다. 생략하는것을 권장한다.
 * + 인터페이스는 다중 구현(다중 상속)을 지원한다.
 * + 인터페이스에서 멤버 변수는 public, static, final 이 모두 포함 되어있다고 간주한다. (언더스코어_)로 구분한다.
 *
 * -> uml에서 상속은 실선, 인터페이스는 점선으로 한다. 상속은 상속한다. 인터페이스는 구현한다. 라고 표현한다.
 */
public interface InterfaceAnimal {
    void sound(); //public abstract
    void move(); //public abstract
}
