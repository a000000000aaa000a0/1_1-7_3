package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Budgerigar extends Crow{
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String budgerigar_name = "セキセイインコ";
    private String budgerigar_habitat = "オーストラリア、アメリカ、日本";
    private String budgerigar_info = "セキセイインコ愛好家の間では、インコ臭と呼ばれるセキセイインコの体から香る穀物のような特有の体臭を楽しむ趣がある。";
    
    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    // セキセイインコの情報をIndicationBirdDetailメソッドを使用し、表示する。
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("セキセイインコの情報");
        System.out.println("名前：" + budgerigar_name);
        System.out.println("生息地：" + budgerigar_habitat);
        System.out.println("説明：" + budgerigar_info);
    }

   
}
