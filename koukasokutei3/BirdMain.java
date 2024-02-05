package koukasokutei3;

// Scannerクラスをインポートする。
import java.util.Scanner;
// BirdMainクラスを定義する。
class BirdMain {
    // メインメソッド
    public static void main(String[] args) {
        // Crow型の変数Birdsを宣言し、それぞれのクラスのオブジェクトを代入する配列を作成。
        Crow[] birds = new Crow[]{
            // それぞれのクラスをインスタンス化して、変数birdsの配列に代入する。
            new Crow(),
            new Sparrow(),
            new Chicken(),
            new Cockatiel(),
            new Shimaenaga(),
            new Penguin(),
            new Cassowary(),
            new Mameluliha(),
            new Budgerigar(),
            new Pitohui(),
        };

        // BirdNumberInputメソッドを呼び出す。
        int birdNumber = BirdNumberInput();

        // 変数birdsの配列の入力された番号を-1した箇所に代入されているクラスを表示する。
        birds[birdNumber -1].IndicationBirdDetail(birdNumber);
    }
    
    // 入力された整数を変数birdNumberに入れ、birdNumberの整数を戻り値として返却するメソッド。
    public static int BirdNumberInput() {   
        // 詳細を見たい鳥の番号を入力してもらう。
        // 入力した番号をScannerクラスの変数xに代入する。 
        System.out.print("1:ハシボソガラス\n2:スズメ\n3:ニワトリ\n4:オカメインコ\n5:シマエナガ\n6:フンボルトペンギン\n7:ヒクイドリ\n8:マメルリハ\n9:セキセイインコ\n10:ズグロモリモズ\n閲覧したい鳥の番号を入力してください: ");
        Scanner x = new Scanner(System.in);
        // 変数xの番号をint型の変数birdNumberに代入する。
        int birdNumber = x.nextInt();
        // Scannerクラスを閉じる。
        x.close();
        // 戻り値として、変数birdNumberの値を返却する。
        return birdNumber;
    }
}
