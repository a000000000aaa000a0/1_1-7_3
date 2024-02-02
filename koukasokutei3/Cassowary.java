package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Cassowary extends Crow{
    String cassowary_name = "ヒクイドリ";
    String cassowary_habitat = "オーストラリア北東部";
    String cassowary_info = "長い刃物のような足指から「世界一危険な鳥」と呼ばれることがある。";
    
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + cassowary_name);
        System.out.println("生息地：" + cassowary_habitat);
        System.out.println("説明：" + cassowary_info);
    }

  
}
