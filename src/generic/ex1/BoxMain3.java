package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        //생성 시점의 T의 타입이 결정됨
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);

        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("test");

        String str = stringBox.get();
        System.out.println("str = " + str);


        //타입 추론
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);

        double pi = doubleBox.get();
        System.out.println("pi = " + pi);
    }
}
