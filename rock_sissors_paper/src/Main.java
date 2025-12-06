import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(sc);
        Random random = new Random();
        Com com = new Com(random);
        Judge judge = new Judge();
        
        InitialPreview.preview();

        Result result; // String から Result 型へ
        do {
            // int ではなく Hand 型で受け取る
            Hand userHand = user.userHand();
            Hand comHand = com.comHand();

            // 判定
            result = judge.judging(userHand, comHand);

            // 結果表示
            ResultOutput.resultView(userHand, comHand, result);

        } while(result == Result.DRAW); // 文字列比較 .equals ではなく == で比較できる！
    }
}