class Person {
    private String name;
    private String job;

    // Personクラスのコンストラクタを定義する。
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // 自己紹介メソッド
    public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
    }
}

class Teacher extends Person {
    private String subject;

    // Teacherクラスのコンストラクタを定義する。
    public Teacher(String name, String job, String subject) {
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

class Cook extends Person {
    private String specialities;

    // Cookクラスのコンストラクタを定義する。
    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    }

    // 自己紹介メソッドをオーバーライド
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("得意料理：" + this.specialities);
    }
}

class M12_2 {
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");

        // 自己紹介
        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
}
