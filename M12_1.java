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
        // 整数を入力させる
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();
        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();

        // MoreCalcクラスのインスタンスを生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値を計算して表示
        int sum = moreCalc.calcSum(num1, num2);
        System.out.println("Sum " + num1 + " and " + num2 + " = " + sum);

        // 平均値を計算して表示
        int ave = moreCalc.calcAve(num1, num2);
        System.out.println("Average " + num1 + " and " + num2 + " = " + ave);

        // 累乗を計算して表示
        int pow = moreCalc.calcPow(num1, num2);
        System.out.println("Power " + num1 + " of " + num2 + " = " + pow);
    }
}
