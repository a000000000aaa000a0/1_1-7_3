import java.util.Scanner;
class M14_3 {
    
    public static void main(String[] args) {
        // 変数scanに入力してもらった文字列を代入する。
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        System.out.println("文字列を入力：");
        // Scannerクラスのscan変数をStringBuilderクラスのインスタンス変数に代入する。
        StringBuilder x = new StringBuilder(scan.nextLine()); 
        

        // lengthメソッドで変数xの文字数を調べ、文字数が１１字以上の場合はその分を表示しない。
        if (x.length() >= 11) {
            System.out.println(x.substring(0, 10));
        // 文字数が１０字以下の場合すべて表示する。
        } else {
            System.out.println(x);
        }
        // 変数scanのScannerクラスを閉じる。
        // 書かなくてもいいが、処理が重くなるので一応書いておく。
        scan.close();

    }
}