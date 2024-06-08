package ex;

public class CountMain {
    public static void main(String[] args) {
        MaxCount counter = new MaxCount(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println("count = " + count);
    }
}
