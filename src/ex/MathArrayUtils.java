package ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성을 막는다. 인스턴스 생성하여 각 함수에 접근하는것을 방지
    }

    public static int sum(int[] value) {
        int result = 0;
        for (int i : value) {
            result += i;
        }
        return result;
    }

    public static double average(int[] value) {
        return (double) sum(value) / value.length;
    }

    public static int min(int[] value) {
        int min = value[0];
        for (int i : value) {
            if(min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] value) {
        int max = value[0];
        for (int i : value) {
            if(max < i) {
                max = i;
            }
        }
        return max;
    }
}
