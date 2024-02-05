package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Cockatiel extends Crow {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String cockatiel_name = "オカメインコ";
    private String cockatiel_habitat = "オーストラリア";
    private String cockatiel_info = "飼い鳥として日本でも有名な種である。高い知能を有し、雛から育てた場合は人によく懐く。";  

 
    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // オカメインコの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("オカメインコの情報");
        System.out.println("名前：" + cockatiel_name);
        System.out.println("生息地：" + cockatiel_habitat);
        System.out.println("説明：" + cockatiel_info);
    }
}

