package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Penguin extends Crow {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String penguin_name = "フンボルトペンギン";
    private String penguin_habitat = "チリ北部および中部、ペルー";
    private String penguin_info = "絶滅危惧種である一方で、日本の動物園では増えすぎが問題となっている。"; 
    
    
    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // フンボルトペンギンの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("フンボルトペンギンの情報");
        System.out.println("名前：" + penguin_name);
        System.out.println("生息地：" + penguin_habitat);
        System.out.println("説明：" + penguin_info);

    }

   

}

