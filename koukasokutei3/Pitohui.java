package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Pitohui extends Crow{
    String pitohui_name = "ズグロモリモズ";
    String pitohui_habitat = "インドネシア、パプアニューギニアとその周辺の島々";
    String pitohui_info = "筋肉や羽に毒を持ち、毒はヤドクガエルと似た猛毒。人間も羽一枚分で死亡してしまう。";

    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + pitohui_name);
        System.out.println("生息地：" + pitohui_habitat);
        System.out.println("説明：" + pitohui_info);

    }

  
    
}
