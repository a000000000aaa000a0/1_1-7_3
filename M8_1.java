class M8_1 {
    public static void main(String[] args) {
        
        int[] a = new int[10];

        
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        
        for (int i = 0; i < a.length; i++) {
            System.out.println("list[" + (i) + "] = " + a[i]);
        }
    }
}
