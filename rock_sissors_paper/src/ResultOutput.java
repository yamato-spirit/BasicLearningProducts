public class ResultOutput {
    public static void resultView(int user, int com, String result) {
        System.out.println("～結果発表～");
        System.out.println("あなたは" + handChecker(user) + "を出しました");
        System.out.println("COMは" + handChecker(com) + "を出しました");
        resultChecker(result); // じゃんけんの結果を出力(勝ち・負け・あいこ)
    }
    public static String handChecker(int handNum) {
        String hand;
        switch(handNum) {
            case 1 -> {
                hand = "グー";
                break;
            }
            case 2 -> {
                hand = "チョキ";
                break;
            }
            default -> {
                hand = "パー";
                break;
            }
        }
        return hand;
    }
    public static void resultChecker(String result) {
    switch(result) {
        case "勝ち" -> {
            System.out.println("おめでとう！！あなたの勝ちです");
            break;
        }
        case "負け" -> {
            System.out.println("残念！あなたの負けです");
            break;
        }
        default -> {
            System.out.println("あいこです。もう一回！");
            break;
        }
    }
}
}
