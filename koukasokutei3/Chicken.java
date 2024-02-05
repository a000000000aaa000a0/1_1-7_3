package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Chicken extends Crow {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String chicken_name = "ニワトリ";
    private String chicken_habitat = "全世界";
    private String chicken_info = "鶏冠と肉垂がある。足の指は4本、翼は小さいが短距離なら飛ぶことができる。";  


    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // ニワトリの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("ニワトリの情報");
        System.out.println("名前：" + chicken_name);
        System.out.println("生息地：" + chicken_habitat);
        System.out.println("説明：" + chicken_info);
    }

}
