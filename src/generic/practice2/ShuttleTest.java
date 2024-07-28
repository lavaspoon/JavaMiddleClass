package generic.practice2;

import generic.practice2.unit.Marine;
import generic.practice2.unit.Zealot;
import generic.practice2.unit.Zergling;

public class ShuttleTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine(40, "마린"));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling(35, "저글링"));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot(50, "질럿"));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle2);
    }
}
