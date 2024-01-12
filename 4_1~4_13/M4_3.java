import java.util.Scanner;

class M4_3 {
    public static void main(String[] args) {
        System.out.println("0～100 までの得点（整数値）を２つ入力してください");
        System.out.println("国語の得点：");
        Scanner scan = new Scanner(System.in, "Shift-JIS");

        System.out.println("英語の得点：");
        Scanner aaa = new Scanner(System.in, "Shift-JIS");

        int a = scan.nextInt();
        int b = aaa.nextInt();

       
        if (a >= 80 && b >= 80) {
            System.out.println("合格です");
        }

    
        scan.close();
        aaa.close();
    }
}