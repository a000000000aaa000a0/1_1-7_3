import java.util.Scanner;
class M7_3 {
    public static void main(String[] args) {
        // ユーザーから整数を入力
        Scanner a = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int b = a.nextInt();
        a.close();

        
        int c = 0;

        do {
            int d = b % 10; 
            c = c * 10 + d; 
            b = b / 10; 
        } while (b != 0);

        
        System.out.println("反転した結果: " + c);
    }
}

