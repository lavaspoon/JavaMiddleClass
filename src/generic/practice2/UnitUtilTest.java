package generic.practice2;

import generic.practice2.unit.Marine;
import generic.practice2.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine(40,"마린1");
        Marine m2 = new Marine(50,"마린2");
        Marine marine = UnitUtil.maxHp(m1, m2);
        System.out.println("marine = " + marine);

        Zealot z1 = new Zealot(90,"질럿1");
        Zealot z2 = new Zealot(100,"질럿2");
        Zealot zealot = UnitUtil.maxHp(z1, z2);
        System.out.println("zealot = " + zealot);
    }
}
