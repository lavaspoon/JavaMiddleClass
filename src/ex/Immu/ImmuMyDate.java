package ex.Immu;

public class ImmuMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmuMyDate withYear(int newYear) {
        return new ImmuMyDate(newYear, month, day);
    }

    public ImmuMyDate withMonth(int newMonth) {
        return new ImmuMyDate(year, newMonth, day);
    }

    public ImmuMyDate withDay(int newDay) {
        return new ImmuMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
