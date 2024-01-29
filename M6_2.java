class M6_2 {
    public static void main(String[] args) {
    
        // 変数sumに0を代入する。
        int sum = 0;
        // for文で繰り返し文を作成。
        // 変数iに初期値1を代入する。
        // 変数iの値が100以下に限り続ける。
        // i++で変数iの値を1づつ増やす。
        for (int i = 1; i <= 100; i++) {
            // +=演算子で左辺の変数sumと右辺の変数iの値を足し、その合計値を左辺の変数sumに代入する。
            // for文で繰り返し、1から100までを合計して変数sumに代入する。
            sum += i;
        }
        // 合計値を表示する。
        System.out.println("合計は" + sum + "です");
    }
}