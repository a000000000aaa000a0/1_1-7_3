package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Cassowary extends Crow{
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String cassowary_name = "ヒクイドリ";
    private String cassowary_habitat = "オーストラリア北東部";
    private String cassowary_info = "長い刃物のような足指から「世界一危険な鳥」と呼ばれることがある。";
    

    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // ヒクイドリの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("ヒクイドリの情報");
        System.out.println("名前：" + cassowary_name);
        System.out.println("生息地：" + cassowary_habitat);
        System.out.println("説明：" + cassowary_info);
    }

  
}
