import java.util.Scanner;

// Circleクラスを定義する。
class Circle {
    // PI変数に円周率を代入。
    final double PI = 3.1415;

    // 円周の長さを計算するメソッド
    double calcCircumference(double radius) {
        return 2 * PI * radius;
    }

    // 円の面積を計算するメソッド
    double calcArea(double radius) {
        return PI * Math.pow(radius, 2);
    }
}

// Circle2クラスを定義する。
class Circle2 {
    public static void main(String[] args) {
        // Circleクラスのインスタンスを生成
        Circle circleInstance = new Circle();

        System.out.println("半径を整数値で入力：");
        // 入力した整数を変数scanに代入する。
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        // scan変数の整数値をdouble型のradius変数に代入する。
        double radius = scan.nextDouble();

        // Circleクラスのインスタンスメソッドを使って円周の長さと面積を表示する。
        System.out.println("円周の長さは" + circleInstance.calcCircumference(radius) + "です。");
        System.out.printf("円の面積は%.3fです。", circleInstance.calcArea(radius));
    }
}
