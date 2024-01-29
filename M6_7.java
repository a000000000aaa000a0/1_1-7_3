class M6_7 {

    public static void main(String[] args) {
        // int型の配列sumに1から9の整数が代入されている。
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int型の変数aに初期値0を代入する。
        // lengthは配列内の要素数（整数がいくつ代入されているか）を算出する。
        // num.lengthは配列numの要素数をlengthで調べている。
        // a++は変数aの値を1づつ増やす。
        for (int a = 0; a < num.length; a++) {
            // 配列numの要素数（9）未満の間、繰り返し表示する。
            System.out.println((a + 1) + "の段");  
            // int型の変数bに初期値0を渡す。
            // 変数bの数値が配列numの要素数未満の間、続ける。
            // b++で値を1づつ増やす。
            for (int b = 0; b < num.length; b++) {
                // num[a]とは、変数aに代入されている数値と同じ場所に代入されている配列sumの数値を取りだしている。
                // たとえば変数aの値が0だった場合、配列sumの1が取り出される。
                // つまりこの文は変数aと変数bの値の位置にある配列sumの数値を取り出し、２つの値の掛け算の値が変数cに代入される。
                int c = num[a] * num[b];
                // 計算結果を表示する。
                System.out.println(num[a] + " × " + num[b] + " = " + c);
            }
        }
    }
}
