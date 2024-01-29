import java.util.Scanner;
class M14_4 {
    public static void main(String[] args) {
        // 変数scanに入力してもらった文字列を代入する。
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        System.out.println("１つ目文字列を入力：");
        // Scannerクラスのscan変数をStringBuilderクラスのインスタンス変数に代入する。
        StringBuilder x = new StringBuilder(scan.nextLine()); 
        System.out.println("２つ目文字列を入力：");
        StringBuilder y = new StringBuilder(scan.nextLine());
        

        // equalsメソッドでxとyが同じ文字列かどうか比較する。
        if (x.equals(y)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("違う文字列です。");
        }
        // 変数scanのScannerクラスを閉じる。
        // 書かなくてもいいが、処理が重くなるので一応書いておく。
        scan.close();

    }
}
