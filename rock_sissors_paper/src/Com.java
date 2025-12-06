import java.util.Random;

public class Com {
    private final Random random;

    public Com(Random random) {
        this.random = random;
    }

    // 戻り値が int から Hand に変更
    public Hand comHand() {
        // Hand.values() は {ROCK, SCISSORS, PAPER} の配列を返す
        Hand[] hands = Hand.values();
        int randomIndex = random.nextInt(hands.length); // 0～2のランダム
        return hands[randomIndex];
    }
}