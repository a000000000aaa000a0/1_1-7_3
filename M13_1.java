abstract class Person2 {
    private String name;
    private String job;

    // Personクラスのコンストラクトを定義する。
    public Person2(String name, String job) {
        this.name = name;
        this.job = job;
    }
    // 自己紹介
    public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
    }

static class Teacher2 extends Person2 {

    private String subject;
    
    // Teacherクラスのコンストラクタを定義する。
    public Teacher2(String name, String job, String subject) {
            super(name, job);
            this.subject = subject;
    }
    
        // オーバーライドする。
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("担当科目：" + this.subject);
    }
}
    
static class Cook2 extends Person2 {
    private String specialities;
    
    // Cookクラスのコンストラクタを定義する。
    public Cook2(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    }
    
    // 自己紹介メソッドをオーバーライドする。
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("得意料理：" + this.specialities);
    }
}
    
    class M13_1Main {
        public static void main(String[] args) {
            // 教師クラス作成
            Teacher2 teacher = new Teacher2("竹井一馬", "教員", "情報処理");
            // 料理人クラス作成
            Cook2 cook = new Cook2("大原太郎", "シェフ", "オムライス");
    
            // 自己紹介
            teacher.introduce();
            System.out.println();
            cook.introduce();
        }
    }
}    
