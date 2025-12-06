import java.util.Scanner;
import java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 在庫・受注管理システム ===");
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("メインメニュー");
            System.out.println("1：登録（商品の登録をします）");
            System.out.println("2：在庫管理（在庫数を管理します）");
            System.out.println("3：受注処理（商品の出荷を行います）");
            System.out.println("4：売上レポートの確認・出力（商品の売上レポートの確認・ファイル出力をします）");
            System.out.println("9：システム終了");
            System.out.print("番号を入力してください > ");
            // 上記1-4の数字を正しく入力&int型に変換
            int selectedNum = getIntInput(sc);
            switch (selectedNum) {
                case 1 -> {; break;}
                case 2 -> {; break;}
                case 3 -> {; break;}
                case 4 -> {; break;}
                case 9 -> {
                System.out.println(">> システムを終了します。");
                isRunning = false;
                } // フラグをfalseにしてループを抜ける
                default -> {System.out.println("!! 1～4、または9を入力してください。");}
            }
        }
        sc.close();
    }
    /**
     * 安全に数値入力を受け取るメソッド
     * 数字以外の文字（"あ"や"abc"など）が入力されてもエラーで落ちないように制御する
     * * @param sc Mainメソッドで作成したScannerオブジェクト
     * @return 入力された数値。数値以外が入力された場合は -1 を返す
     */
    public static int getIntInput(Scanner sc) {
        try {
            String input = sc.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
        // 数字以外が入力された場合
        // -1 を返して、呼び出し元の default ルート（無効な入力）に行かせる
            e.printStackTrace();
            return -1;
        }
    }
}
