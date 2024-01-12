import java.util.Scanner;

class M4_13 {
    public static void main(String[] args) {
        System.out.println("0～100 までの得点（整数値）を入力してください：");
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        
      
        int a = scan.nextInt();
       
        if (a == 100) {
            System.out.println("満点です");
        }else if (a >= 60){System.out.println("合格です");} 
        else if (a <= 59){System.out.println("不合格です");}
         


        
        scan.close();
    }
}
