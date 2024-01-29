
interface Person3 {
    void introduce();
}

class Teacher3 implements Person3{
    private String name;
    private String job;
    private String subject;

    public Teacher3(String name, String job, String subject){
        this.name = name;
        this.job = job;
        this.subject = subject;
    }
    
    @Override
    public void introduce(){
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("担当科目：" + this.subject);
    }


}

class Cook3 implements Person3{
    private String name;
    private String job;
    private String specialties;

    public Cook3(String name, String job, String specialities) {
        this.name = name;
        this.job = job;
        this.specialties = specialities;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職種：" + this.job);
        System.out.println("得意料理：" + this.specialties);
    }

class M13_3 {
    public static void main(String[] args) {
        Teacher3 teacher = new Teacher3("竹井一馬", "教員", "情報処理");
        Cook3 cook = new Cook3("大原太郎", "シェフ", "オムライス");
    
        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
}

   
}


