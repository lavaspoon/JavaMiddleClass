package generic.practice2;

import generic.practice2.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    //getName 을 호출하기 위해 상한을 둔다.(그렇지 않으면 extends Object)
    //extends BioUnit
    public void showInfo() {
        System.out.println("이름: " + unit.getName() + "HP: " + unit.getHp());
    }
}
