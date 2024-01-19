// CalculationExecutionクラスを定義する。
class CalculationExecution {
    private int x;
    private int y;

    // CalculationExecution クラスのコンストラクタを定義する。
    public CalculationExecution(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 合計値を取得するメソッド
    public int sum() {
        int res = 0;
        for (int num = x; num <= y; num++) {
            res += num;
        }
        return res;
    }

    // xの値を取得するメソッド
    public int getX() {
        return x;
    }

    // yの値を取得するメソッド
    public int getY() {
        return y;
    }
}
// M11_2mainクラスを定義する。
class M11_2main {
    public static void main(String[] args) {
        // 計算実行インスタンスの生成
        CalculationExecution calcExec = new CalculationExecution(100, 200);
        // 合計値を取得
        int total = calcExec.sum();
        // 結果を表示
        System.out.printf("%dから%dの合計値は%dです。\n", calcExec.getX(), calcExec.getY(), total);
    }
}
