package koukasokutei3;

// BirdInterfaceインターフェースを実装する。
class Crow implements BirdInterface {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String crow_name = "ハシボソガラス";
    private String crow_habitat = "ユーラシア大陸";
    private String crow_info = "冬も水浴びする程、寒さに強い。";  

    
    // 実装したインターフェイスのメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // ハシボソガラスの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("ハシボソガラスの情報");
        System.out.println("名前： " + crow_name);
        System.out.println("生息地：" + crow_habitat);
        System.out.println("説明：" + crow_info);
    }

}