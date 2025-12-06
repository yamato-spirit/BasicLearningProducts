import java.util.Random;

public class Com {
    private final Random random;
    public Com(Random random) {
        this.random = random;
    }
    public int comHand() {
        int comHand = random.nextInt(3) + 1; // 1-3でランダムな整数を返す
        return comHand;
    }
}
