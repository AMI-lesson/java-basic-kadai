package kadai_018;

public abstract class Kato_Chapter18 {

    // フィールド
    public String familyName = "加藤"; // デフォルトで「加藤」
    public String givenName; // 名前は子クラスで設定
    public String address = "東京都中野区〇×"; // デフォルト値

    // 共通の紹介を出力する
    public void commonIntroduce() {
        System.out.println("名前は" + this.familyName + this.givenName + "です");
        System.out.println("住所は" + this.address + "です");
    }

    // 個別の紹介を出力する抽象メソッド（サブクラスで実装）
    public abstract void eachIntroduce();

    // 紹介を実行する
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
