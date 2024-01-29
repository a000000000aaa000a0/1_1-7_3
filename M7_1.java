class M7_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        // 変数bの値が１００以下に限り繰り返す。
        // b++でbの値を１づつ増やす。
        // a += b;はa + bの合計値をaに代入する。
        while (b <= 100) {
            a += b;
            b++;
        }

        System.out.println("合計： " + a);
    }



    
}
