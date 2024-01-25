class Student {
    // メンバ変数
    private String name;
    private String number;
    private int japanese;
    private int math;
    private int english;

    // コンストラクタ
    public Student(String name, String number, int japanese, int math, int english) {
        this.name = name;
        this.number = number;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }

    // 平均点を取得するメソッド
    public double getScoreAverage() {
        double ave = getScoreSum() / 3.0;
        return Math.floor(ave * 100) / 100;
    }

    // 合計点を取得するメソッド
    public int getScoreSum() {
        return japanese + math + english;
    }

    public static void main(String[] args) {
        // 学生オブジェクト作成
        Student student_A = new Student("A", "001", 89, 65, 88);
        Student student_B = new Student("B", "002", 80, 95, 64);
        Student student_C = new Student("C", "003", 70, 80, 98);

        // 学生情報の表示
        System.out.println(student_A.getNo() + "番 " + student_A.getName() + "さん 平均点" + student_A.getScoreAverage());
        System.out.println(student_B.getNo() + "番 " + student_B.getName() + "さん 平均点" + student_B.getScoreAverage());
        System.out.println(student_C.getNo() + "番 " + student_C.getName() + "さん 平均点" + student_C.getScoreAverage());
    }

    // Getterメソッド
    public String getName() {
        return name;
    }

    public String getNo() {
        return number;
    }
}
