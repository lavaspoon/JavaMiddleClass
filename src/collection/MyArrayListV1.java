package collection;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size;

    //기본생성자로 배열크기 세팅
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    //생성자 파라미터로 배열크기 세팅
    public MyArrayListV1(int capacity) {
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object o) {
        elementData[size] = o;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public void set(int index, Object o) {
        elementData[index] = o;
    }
}
