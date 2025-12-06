public class ResultOutput {
    // 引数がすべて Enum になったことで非常にスッキリ！
    public static void resultView(Hand user, Hand com, Result result) {
        System.out.println("～結果発表～");
        
        // .getDisplayName() を呼ぶだけでOK
        System.out.println("あなたは" + user.getDisplayName() + "を出しました");
        System.out.println("COMは" + com.getDisplayName() + "を出しました");
        
        resultChecker(result);
    }

    public static void resultChecker(Result result) {
        // 文字列比較ではなく Enum の分岐なので安全
        switch(result) {
            case WIN -> System.out.println("おめでとう！！あなたの勝ちです");
            case LOSE -> System.out.println("残念！あなたの負けです");
            case DRAW -> System.out.println("あいこです。もう一回！");
        }
    }
}