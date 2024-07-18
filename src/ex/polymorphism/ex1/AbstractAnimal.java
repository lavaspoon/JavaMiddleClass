package ex.polymorphism.ex1;

public abstract class AbstractAnimal { //abstract 는 new 연산자로 생성하는것을 못하도록 제약한다.
    public abstract void sound(); //abstract는 반드시 override 하여 구현 하도록함
    public abstract void move();
}
