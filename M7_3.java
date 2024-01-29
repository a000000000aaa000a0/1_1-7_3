import java.util.Scanner;
class M7_3 {
    public static void main(String[] args) {
        // 入力してもらった整数をScannerクラスの変数aに代入し、int型の変数bに代入しなおす。
        // そのままだと代入できないので、nextIntで変数aをint型に変え変数bに代入する。
        Scanner a = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int b = a.nextInt();
        // 変数aのScanerクラスを閉じる。
        // この文は書かなくても良いらしいが、閉じないとメモリの容量を無駄に圧迫するため一応書いておく。
        a.close();

        // int型の変数cに初期値の０を与える。
        int c = 0;
        // 変数dに変数bを１０で割った余りが代入される。
        do {
            int d = b % 10;
            // 変数cにc * 10 + dの値を代入する。
            c = c * 10 + d;
            // 変数bにbを１０で割った数字を代入する。
            b = b / 10; 
        // 変数bの値が０でない限り繰り返す。
        } while (b != 0);

        
        System.out.println("反転した結果: " + c);
    }
}

