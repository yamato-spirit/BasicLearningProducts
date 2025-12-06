import java.util.Arrays;

public enum Hand {
    // 定数の定義 (名前, ID, 表示名)
    ROCK(1, "グー"),
    SCISSORS(2, "チョキ"),
    PAPER(3, "パー");

    private final int id;
    private final String displayName;

    // コンストラクタ
    Hand(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    // ID (1, 2, 3) から Hand を取得する便利メソッド
    public static Hand getHandById(int id) {
        return Arrays.stream(values())
                .filter(h -> h.id == id)
                .findFirst()
                .orElse(null);
    }
}