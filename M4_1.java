import java.util.Scanner;

class M4_1 {
    public static void main(String[] args) {
        System.out.println("0～100 までの得点（整数値）を入力してください：");
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        
      
        int a = scan.nextInt();
       
        if (a >= 80) {
            System.out.println("合格です");
        }

        
        scan.close();
    }
}

       
      
