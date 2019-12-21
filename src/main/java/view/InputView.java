package view;

import java.util.Scanner;

public class InputView {
    private static final String newLine = "\n";
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println(newLine + "## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputMenu() {
        System.out.println(newLine + "원하는 기능을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputOrder() {
        System.out.println(newLine + "등록할 메뉴를 선택하세요.");
        return scanner.nextInt();
    }
}
