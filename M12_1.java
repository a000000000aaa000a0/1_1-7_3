import java.util.Scanner;

// Calculatorクラスの定義
class Calculator {
    // 合計値を計算するメソッド
    int calcSum(int x, int y) {
        return x + y;
    }

    // 平均値を計算するメソッド
    int calcAve(int x, int y) {
        return (x + y) / 2;
    }
}

// MoreCalcクラスの定義
class MoreCalc extends Calculator {
    // 累乗を計算するメソッド
    int calcPow(int x, int y) {
        return (int) Math.pow(x, y);
    }
}

// メインクラス
class Main {
    public static void main(String[] args) {
        // 変数scannerに入力した整数を代入する。
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int x = scanner.nextInt();
        System.out.print("整数を入力してください：");
        int y = scanner.nextInt();

        // MoreCalcクラスのインスタンス変数を生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値を計算して表示
        int sum = moreCalc.calcSum(x, y);
        System.out.println(x + " and " + y + " = " + sum);

        // 平均値を計算して表示
        int ave = moreCalc.calcAve(x, y);
        System.out.println("Average " + x + " and " + y + " = " + ave);

        // 累乗を計算して表示
        int pow = moreCalc.calcPow(x, y);
        System.out.println("Power " + x + " of " + y + " = " + pow);
    }
}
