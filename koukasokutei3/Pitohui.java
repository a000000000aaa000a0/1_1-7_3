package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Pitohui extends Crow{
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String pitohui_name = "ズグロモリモズ";
    private String pitohui_habitat = "インドネシア、パプアニューギニアとその周辺の島々";
    private String pitohui_info = "筋肉や羽に毒を持ち、毒はヤドクガエルと似た猛毒。人間も羽一枚分で死亡してしまう。";


    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        //  ズグロモリモズの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("ズグロモリモズの情報");
        System.out.println("名前：" + pitohui_name);
        System.out.println("生息地：" + pitohui_habitat);
        System.out.println("説明：" + pitohui_info);

    }

  
    
}
