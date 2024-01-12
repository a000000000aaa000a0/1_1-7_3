public class M7_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1; // Starting from 1

        do {
            a += b;
            b++;
        } while (b <= 100);

        System.out.println("合計： " + a);
    }
}
