package koukasokutei3;

// インターフェースを実装したCrowクラスを継承する。
class Sparrow extends Crow {
    String sparrow_name = "スズメ";
    String sparrow_habitat = "ユーラシア大陸";
    String sparrow_info = "人間が住み始めた集落にはスズメも居着き、逆に人間が離れ集落が無人になるとスズメも見られなくなるという傾向がある。";  

    
    @Override
    public void IndicationBirdDetail(int birdNumber) {
        System.out.println("鳥の詳細情報：");
        System.out.println("名前：" + sparrow_name);
        System.out.println("生息地： " + sparrow_habitat);
        System.out.println("説明： " + sparrow_info);
    }

 
}