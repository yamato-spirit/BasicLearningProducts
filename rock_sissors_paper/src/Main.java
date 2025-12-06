import java.util.Scanner.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(sc);
        Random random = new Random();
        Com com = new Com(random);
        Judge judge = new Judge();
        InitialPreview.preview(); // 初期表示
        String result;
        do {
            // ユーザーの手を入力 -> userHand(int型)
            int userHand = user.userHand();
            // COMの手を入力 -> comHand(int型)
            int comHand = com.comHand();
            // 結果判定 -> result(String型)
            result = judge.judging(userHand, comHand);
            ResultOutput.resultView(userHand, comHand, result); // 結果の画面出力
        } while(result.equals("あいこ"));
    }
}
