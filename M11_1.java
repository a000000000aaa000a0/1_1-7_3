import java.util.Scanner;
// クラスを定義する。
class Circle {
    public static void main(String[] args) {
        // 半径を整数値で入力させる。
        System.out.println("半径を整数値で入力：");
        // 入力した整数を変数scanに代入する。
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        
        // scanの整数値を、double型radius変数に代入する。
        double radius = scan.nextDouble();
        
        // PI変数に円周率を代入する。
        double PI = 3.1415;
        
        // 円周の長さと面積をそれぞれ表示する。
        System.out.println("円周の長さは" + (radius * 2 * PI) + "です。");
        
        System.out.printf("円の面積は%.3fです。", (radius * radius * PI));
        
       
    }
}
