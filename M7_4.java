class M7_4 {
    
    public static void main(String[] args){
        int a = 1;
        int b = 0;

        while (b <= 100000) {
            b += a;
            a += 1;
        }

        System.out.println("合計が 100000 を超える n は " + (a - 1) + " です。");
    }
}
