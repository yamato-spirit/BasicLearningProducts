import java.util.Scanner;

public class User {
    private final Scanner sc;

    public User(Scanner sc) {
        this.sc = sc;
    }

    // 戻り値が int から Hand に変更
    public Hand userHand() {
        System.out.println("あなたの番です　以下の数字の中からお好きな数字を一つ入力してください(半角文字)");
        System.out.println("グー：1　チョキ：2　パー：3");
        
        String input;
        while(true) {
            input = sc.nextLine();
            if (input.matches("[1-3]")) {
                break;
            } else {
                System.out.println("入力が不正です！1-3の間の整数を入力してください");
            }
        }
        
        // 入力された数字(String)をintにし、それをHand型に変換して返す
        int handId = Integer.parseInt(input);
        return Hand.getHandById(handId);
    }
}