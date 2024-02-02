package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Shimaenaga extends Crow {
    String shimaenaga_name = "シマエナガ";
    String shimaenaga_habitat = "北海道";
    String shimaenaga_info = "季は山地上部にいた個体が越冬のため、低地の里山に降りてくることがある。";

  

    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + shimaenaga_name);
        System.out.println("生息地：" + shimaenaga_habitat);
        System.out.println("説明：" + shimaenaga_info);

    }

    

    
}
