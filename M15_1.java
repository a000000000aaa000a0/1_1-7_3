import java.util.Scanner;


class M15_1 {
    public static void main(String[] args) {
        try {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("整数１：");
            int x = stdIn.nextInt();
            System.out.print("整数２：");
            int y = stdIn.nextInt();
            int z = x / y;

            System.out.println(x + "/" + y + "=" + z);
            System.out.println("処理終了");
        } catch (ArithmeticException e) {
            System.out.println("０による割り算です。");
            System.out.println("処理終了");
        } 
           
        
    }
}
