public enum Result {
    WIN("勝ち"),
    LOSE("負け"),
    DRAW("あいこ");

    private final String message;

    Result(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}