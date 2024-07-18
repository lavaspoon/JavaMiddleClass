package ex.local;

import java.lang.reflect.Field;

/* 지역클래스는 지역변수에 접근 할 수 있으나, 값을 변경해서는 안된다. */
public class LocalOuter {

    private int outInstanceVar = 3;

    public Printer process(int paramVal) {

        final int localVar = 1; //지역변수

        class LocalPrinter implements Printer { //지역클래스

            int value = 0;

            @Override
            public void print() {
                System.out.println("value: " + value);

                //인스턴스는 지역변수 보다 오래 살아남는다.
                System.out.println("localVar= " + localVar);
                System.out.println("paramVal= " + paramVal);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }

        }
        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        Printer process = new LocalOuter().process(2);

        process.print();
    }
}
