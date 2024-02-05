package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Sparrow extends Crow {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String sparrow_name = "スズメ";
    private String sparrow_habitat = "ユーラシア大陸";
    private String sparrow_info = "人間が住み始めた集落にはスズメも居着き、逆に人間が離れ集落が無人になるとスズメも見られなくなるという傾向がある。";  

    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // スズメの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("スズメの情報");
        System.out.println("名前：" + sparrow_name);
        System.out.println("生息地： " + sparrow_habitat);
        System.out.println("説明： " + sparrow_info);
    }

 
}