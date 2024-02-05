package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Mameluliha extends Crow{
    // それぞれ変数に名前、生息地、説明の文字列を代入する。
    private String mameluliha_name = "マメルリハ";
    private String mameluliha_habitat = "エクアドル、ペルー北西部の太平洋沿岸";
    private String mameluliha_info = "ペットとして飼育されるインコの中では最小。";
    
    // 継承したCrowクラスが実装していたインターフェイスで定義されているメソッドをオーバーライドする。
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        //マメルリハの情報をIndicationBirdDetailメソッドを使用し、表示する。
        System.out.println("マメルリハの情報");
        System.out.println("名前： " + mameluliha_name);
        System.out.println("生息地：" + mameluliha_habitat);
        System.out.println("説明：" + mameluliha_info);
    }

   
}
