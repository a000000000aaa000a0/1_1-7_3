import java.util.Scanner;

class M14_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        System.out.println("文字列を入力：");
        String x = scan.nextLine(); 
        System.out.println(x);
        System.out.println("入力された文字数は" + x.length() + "です。");

    }
}
