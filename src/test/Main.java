package test;

public class Main {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println(value.getLevel() + value.getDescription());
        }
    }
}
