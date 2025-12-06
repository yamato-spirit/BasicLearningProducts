public class Judge {
    public String judging(int user, int com) {
        int judgeNum = (user - com + 3) % 3;
        String result;
        switch (judgeNum) {
            case 1 -> {
                result = "負け";
                break;
            }
            case 2 -> {
                result = "勝ち";
                break;
            }
            default -> {
                result = "あいこ";
            }
        }
        return result;
    }
}
