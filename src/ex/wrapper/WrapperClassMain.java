package ex.wrapper;

public class WrapperClassMain {
    //Int -> Integer || Integer -> Int
    public static void main(String[] args) {
        //Primitive -> Wrapper  => valueOf()
        int value = 7;
        Integer boxedValue = value;

        //Wrapper -> Primitive => intValue()
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }

}
