package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Budgerigar extends Crow{
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    String budgerigar_name = "セキセイインコ";
    String budgerigar_habitat = "オーストラリア、アメリカ、日本";
    String budgerigar_info = "セキセイインコ愛好家の間では、インコ臭と呼ばれるセキセイインコの体から香る穀物のような特有の体臭を楽しむ趣がある。";
    
    
    @Override
    public void displayBirdDetails(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + budgerigar_name);
        System.out.println("生息地：" + budgerigar_habitat);
        System.out.println("説明：" + budgerigar_info);
    }

   
}
