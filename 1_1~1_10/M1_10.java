import java.util.Scanner;

class M1_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Shift-JIS");

        System.out.println("文字の入力:");
        String a = scan.next();
        
        System.out.println("整数の入力:");
        int b = scan.nextInt();
       

        System.out.println("小数の入力:");
        double c = scan.nextDouble();
        

        System.out.println("入力された文字 = " + a);  
        System.out.println("入力された整数 = " + b);
        System.out.println("入力された小数 = " + c);
       
        scan.close();
    }
}
