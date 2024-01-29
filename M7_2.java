class M7_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1; 
        // b++;でbの値を１づつ増やし、a += bでa + bの値をaに代入する。
        // この文はbの値が１００以下に限り繰り返す。
        do {
            a += b;
            b++;    
        } while (b <= 100);

        System.out.println("合計： " + a);
    }
}
