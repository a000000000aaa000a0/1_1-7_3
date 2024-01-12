
import java.util.Scanner;

class M5_1 {
    public static void main(String[] args) {
        System.out.println("A～Dの値を入力してください：");
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        
    
        String input = scan.next();
       
       
        if (input.equals("A")) {
            System.out.println("ランクAは評価「優」です");
        } else if (input.equals("B")) {
            System.out.println("ランクBは評価「良」です");
        } else if (input.equals("C")) {
            System.out.println("ランクCは評価「可」です");
        } else if (input.equals("D")) {
            System.out.println("ランクDは評価「不可」です");
        } 
    scan.close();
    }
}
