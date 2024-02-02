package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Penguin extends Crow {
    String penguin_name = "フンボルトペンギン";
    String penguin_habitat = "チリ北部および中部、ペルー";
    String penguin_info = "絶滅危惧種である一方で、日本の動物園では増えすぎが問題となっている。"; 
    
    
   
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + penguin_name);
        System.out.println("生息地：" + penguin_habitat);
        System.out.println("説明：" + penguin_info);

    }

   

}

