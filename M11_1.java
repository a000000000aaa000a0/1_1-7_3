import java.util.Scanner;
// Circleクラスを定義する。
class Circle {
    
    static final double PI = 3.1415;

}
// Circle2クラスを定義する。
class Circle2 {
    public static void main(String[] args) {
        System.out.println("半径を整数値で入力：");
        // 入力した整数を変数scanに代入する。
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        // scan変数の整数値をdouble型のradius変数に代入する。
        double radius = scan.nextDouble();

        // 円周の長さと面積をそれぞれ表示する。
        System.out.println("円周の長さは" + (radius * 2 * Circle.PI) + "です。");
        System.out.printf("円の面積は%.3fです。", (radius * radius * Circle.PI));
    }
}
