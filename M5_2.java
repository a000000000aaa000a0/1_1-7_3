import java.util.Scanner;

class M5_2 {
    public static void main(String[] args) {
        System.out.println("クラス番号（1～3）の値を入力してください：");
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        
    
        String input = scan.next();
       
       
        if (input.equals("1")) {
            System.out.println("大原情報コース");
        } else if (input.equals("2")) {
            System.out.println("OAビジネスコース");
        } else if (input.equals("3")) {
            System.out.println("税理士コース");
        }  else {
            System.out.println("不正な入力です");
        }
    scan.close();
    }
}
