package koukasokutei3;

// BirdInterfaceインターフェースを実装する。
class Crow implements BirdInterface {
    String crow_name = "ハシボソガラス";
    String crow_habitat = "ユーラシア大陸";
    String crow_info = "全長約50cm。冬も水浴びする程、寒さに強い。";  

   
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前： " + crow_name);
        System.out.println("生息地：" + crow_habitat);
        System.out.println("説明：" + crow_info);
    }

}