class M8_5 {
    public static void main(String[] args) {
        // 要素数が5のリストを作る。
        int[] array = {1, 2, 3, 4, 5};
        // 合計
        int a = 0;

        for (int i = 0; i < array.length ; i ++){
            a += array[i];
        }
        // 合計を表示
        System.out.println("合計値は" + a + "です。");
        // 平均を表示
        System.out.println("平均値は" + (a / array.length) + "です。");
      
        



    }
    
    
}
