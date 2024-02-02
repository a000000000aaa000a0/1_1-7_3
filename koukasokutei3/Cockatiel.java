package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Cockatiel extends Crow {
    String cockatiel_name = "オカメインコ";
    String cockatiel_habitat = "オーストラリア";
    String cockatiel_info = "飼い鳥として日本でも有名な種である。高い知能を有し、雛から育てた場合は人によく懐く。";  

 

    @Override
    public void displayBirdDetails(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + cockatiel_name);
        System.out.println("生息地：" + cockatiel_habitat);
        System.out.println("説明：" + cockatiel_info);
    }
}

