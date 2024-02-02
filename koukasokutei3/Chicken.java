package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Chicken extends Crow {
    String chicken_name = "ニワトリ";
    String chicken_habitat = "全世界";
    String chicken_info = "鶏冠と肉垂がある。足は4本、翼は小さいが飛ぶことがある。";  



    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + chicken_name);
        System.out.println("生息地：" + chicken_habitat);
        System.out.println("説明：" + chicken_info);
    }

}
