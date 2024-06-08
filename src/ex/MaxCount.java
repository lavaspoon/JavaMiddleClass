package ex;

public class MaxCount {
    private int count = 0;
    private int max;

    //다른 패키지에서도 사용
    public MaxCount(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        } else {
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }
}
