package ex.Immu;

public class ImmuMyDateMain {

    public static void main(String[] args) {
        ImmuMyDate date1 = new ImmuMyDate(2024, 1, 1);
        ImmuMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
