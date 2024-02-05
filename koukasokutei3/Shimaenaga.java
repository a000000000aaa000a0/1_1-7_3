package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Shimaenaga extends Crow {
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String shimaenaga_name = "シマエナガ";
    private String shimaenaga_habitat = "北海道";
    private String shimaenaga_info = "冬の時は、白くて真ん丸な姿になる。";

  
    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        // シマエナガの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("シマエナガの情報");
        System.out.println("名前：" + shimaenaga_name);
        System.out.println("生息地：" + shimaenaga_habitat);
        System.out.println("説明：" + shimaenaga_info);

    }

    
}
