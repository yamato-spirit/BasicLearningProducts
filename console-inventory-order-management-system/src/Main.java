import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("以下の4つから好きなメニュー番号を選択してください　(入力例：4）");
        System.out.println("1：登録（商品の登録をします）");
        System.out.println("2：在庫管理（在庫数を管理します）");
        System.out.println("3：受注処理（商品の出荷を行います）");
        System.out.println("4：売上レポートの確認・出力（商品の売上レポートの確認・ファイル出力をします）");
        // 上記1-4の数字を正しく入力&int型に変換
        String selectedNum_s;
        while (true) {
            selectedNum_s = sc.nextLine();
            if (selectedNum_s.matches("[1-4]")) break;
            else System.out.println("不正な入力です！1-4の数字を入力して下さい");
        }
        int selectedNum = Integer.parseInt(selectedNum_s);
        switch (selectedNum) {
            case 1 -> {; break;}
            case 2 -> {; break;}
            case 3 -> {; break;}
            case 4 -> {; break;}
        }
        System.out.println("いずれかのメニュー番号を選択してください　(入力例：1）");
        System.out.println("0：メニューに戻る");
        System.out.println("1：終了");
    }
}
