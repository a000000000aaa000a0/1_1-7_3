class M6_7 {

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int a = 0; a < num.length; a++) {
            System.out.println((a + 1) + "の段");  
            for (int b = 0; b < num.length; b++) {
                int c = num[a] * num[b];
                System.out.println(num[a] + " × " + num[b] + " = " + c);
            }
        }
    }
}
