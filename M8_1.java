class M8_1 {
    public static void main(String[] args) {
        // ０を１０個持った（自動的に０が初期値になる）配列を作り、変数aに代入する。
        int[] a = new int[10];

        
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        
        for (int i = 0; i < a.length; i++) {
            System.out.println("list[" + (i) + "] = " + a[i]);
        }
    }
}
