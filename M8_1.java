class M8_1 {
    public static void main(String[] args) {
        // ０を１０個持った（自動的に０が初期値になる）配列を作り、変数aに代入する。
        int[] a = new int[10];

        // 変数iに初期値の０を代入し、ループするたびに１づつ増やす。
        // iの値が配列aの要素数未満に限り、繰り返す。
        for (int i = 0; i < a.length; i++) {
            // 変数iの値の配列aの場所にiの値に１を足した数を代入する。
            a[i] = i + 1;
        }

        
        for (int i = 0; i < a.length; i++) {
            System.out.println("list[" + (i) + "] = " + a[i]);
        }
    }
}
