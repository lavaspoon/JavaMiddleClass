package ex.lang;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");

        System.out.println("result = " + result);

        String[] arr = {"hello", "java", "jvm"};

        int sum = 0;
        for (String s : arr) {
            System.out.println("s.length() = " + s.length());
            sum += s.length();
        }
        System.out.println("sum = " + sum);

        String str = "test.txt";

        int index = str.indexOf(".txt");
        System.out.println("index = " + index);

        String ref = "hello.txt";
        String fileName = ref.substring(0, 5);
        String extName = ref.substring(5, 9);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);

        String fileRef = "hello.txt";
        int extIndex = ref.indexOf(".txt");

        String fileNm = str.substring(0, extIndex);
        String extNm = str.substring(extIndex);

        System.out.println("fileNm = " + fileNm);
        System.out.println("extNm = " + extNm);

        String original = "   Hello Java";
        String trim = original.trim();
        System.out.println("trim = " + trim);

        String replace = trim.replace("Java", "jpa");
        System.out.println("replace = " + replace);

        String email = "lava@naver.com";

        String[] parts = email.split("@");
        String head = parts[0];
        String detail = parts[1];

        System.out.println("head = " + head);
        System.out.println("detail = " + detail);
    }

}
