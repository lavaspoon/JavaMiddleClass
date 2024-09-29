package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    /**
     * 의존관계 주입
     * MyList = new MyLinkedList
     * MyList = new MyArrayList
     */
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        for (int i=0; i<size; i++) {
            list.add(i);
        }
    }
}
