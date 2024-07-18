package ex.lang;

public class CharArrayMain {

    public static void main(String[] args) {
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        String result1 = "test";
        String result2 = "abc";

        String concat = result1.concat(result2);
        System.out.println("concat = " + concat);

        String result3 = "abc";

        System.out.println(result2==result3);
        System.out.println(result2.equals(result3));

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        sb.insert(4, "java");

        System.out.println("sb = " + sb);

        String string = sb.toString();
        System.out.println("string = " + string);
    }

}
