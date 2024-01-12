import java.util.Scanner;

public class M3_14 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("縦の長さ: ");
        double vertical = scanner.nextDouble();

    
        System.out.print("横の長さ: ");
        double horizontal = scanner.nextDouble();

     
        double area = vertical * horizontal;

   
        System.out.println("長方形の面積= " + area);

      
        scanner.close();
    }
}

