package koukasokutei3;

import java.util.Scanner;

// BirdMainクラスを定義する。
class BirdMain {
    // メインメソッド
    public static void main(String[] args) {
        // BirdInterface型の変数Birdsを宣言し、それぞれのクラスのオブジェクトを代入する配列を作成。
        BirdInterface[] birds = new BirdInterface[]{
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

        // getNumberInputメソッドの戻り値をbirdNumber変数に代入する。
        int birdNumber = BirdNumberInput();

        // 変数birdNumberの値を-1をした数値と同じ場所にある文字列をdisplayBirdDetailsメソッドに渡す。
        birds[birdNumber - 1].displayBirdDetails(birdNumber);
    }

    private static int BirdNumberInput() {
       
        // 詳細を見たい鳥の番号を入力してもらう。
        // 入力した番号をScannerクラスの変数scanに代入する。
        Scanner scan = new Scanner(System.in);
        System.out.print("1:ハシボソガラス\n2:スズメ\n3:ニワトリ\n4:オカメインコ\n5:シマエナガ\n6:フンボルトペンギン\n7:ヒクイドリ\n8:マメルリハ\n9:セキセイインコ\n10:ズグロモリモズ\n閲覧したい鳥の番号を入力してください: ");
        // 変数scanの番号をint型の変数birdNumberに代入する。
        int birdNumber = scan.nextInt();
        // Scannerクラスを閉じる。
        scan.close();
        // 戻り値として、変数birdNumberの値を返却する。
        return birdNumber;
        
    

    }
}
