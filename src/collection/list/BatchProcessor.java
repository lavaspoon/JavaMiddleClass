package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    /**
     * 생성자 의존관계 주입 (DI)
     * MyList = new MyLinkedList
     * MyList = new MyArrayList
     * 어떤 MyList list의 구현체를 선택할 지는 실행 시점에 생성자를 통해서 결정
     */
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            list.add(0, i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }
}
