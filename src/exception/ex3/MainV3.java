package exception.ex3;

import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) throws NetworkClientExceptionV3 {
        NetworkServiceV3 networkServiceV0 = new NetworkServiceV3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
