public class Judge {
    // Hand同士を受け取り、Resultを返す
    public Result judging(Hand user, Hand com) {
        // Enumの中に持たせた id を使って計算
        int judgeNum = (user.getId() - com.getId() + 3) % 3;

        // 数字ではなく Enum を返す
        switch (judgeNum) {
            case 2 -> { return Result.WIN; }
            case 1 -> { return Result.LOSE; }
            default -> { return Result.DRAW; }
        }
    }
}