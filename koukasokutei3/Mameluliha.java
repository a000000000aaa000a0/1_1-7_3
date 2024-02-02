package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Mameluliha extends Crow{
    String mameluliha_name = "マメルリハ";
    String mameluliha_habitat = "エクアドル、ペルー北西部の太平洋沿岸";
    String mameluliha_info = "ペットとして飼育されるインコの中では最小。";
    
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前： " + mameluliha_name);
        System.out.println("生息地：" + mameluliha_habitat);
        System.out.println("説明：" + mameluliha_info);
    }

   
}
