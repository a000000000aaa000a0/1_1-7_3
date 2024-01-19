import java.util.Scanner;

class M1_9 {

    public static void main(String[] args) {

        System.out.println("お名前を入力してください");

        Scanner scan = new Scanner(System.in, "Shift-JIS");

        String str = scan.next();

        System.out.println("こんにちは" +  str  + "さん");

    }

}