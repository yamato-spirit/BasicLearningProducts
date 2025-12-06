import java.util.Scanner;
import java.util.Scanner.*;

public class User {
    private final Scanner sc;
    public User(Scanner sc) {
        this.sc = sc;
    }
    public int userHand() {
        System.out.println("あなたの番です　以下の数字の中からお好きな数字を一つ入力してください(半角文字)");
        System.out.println("グー：1　チョキ：2　パー：3");
        String userHand;
        while(true) {
            userHand = sc.nextLine();
            if (checkUserHand(userHand)) break;
            else {
                System.out.println("入力が不正です！1-3の間の整数を入力してください");
                System.out.println("グー：1　チョキ：2　パー：3");
            }
        }
        return Integer.parseInt(userHand);
    }
    // ユーザーが1-3のいずれかの数字を入力したか判断する
    public boolean checkUserHand(String userHand) {
        return userHand.matches("[1-3]");
    }
}
