import java.util.InputMismatchException;
import java.util.Scanner;

class M15_2 {
    public static void main(String[] args) {
        try {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("整数を入力：");
            int x = stdIn.nextInt();

            if (x % 2 == 0) {
                System.out.println(x + " は偶数です。");
            } else {
                System.out.println(x + " は奇数です。");
            }
        } catch (InputMismatchException e) {
           
            System.out.println("整数と認識されません。");
        }
    }
}
