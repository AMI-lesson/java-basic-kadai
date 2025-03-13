package kadai_018;

public abstract class Kato_Chapter18 {

	//フィールド
	public String familyName;//姓を表す
	public String givenName;//名を表す
	public String address;//住所を表す

	// コンストラクタ
    public Kato_Chapter18(String familyName, String givenName, String address) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.address = address;
    }


	//共通の紹介を出力する
	public void commonIntroduce	(){
		System.out.println("名前は"+this.familyName+this.givenName+"です");
		System.out.println("住所は"+this.address+"です");

	}

	//個別の紹介を出力する
	// 個別の紹介を出力する抽象メソッド（サブクラスで実装）
	public abstract void eachIntroduce();

	//紹介を実行する,まとめて実行するため
	//execIntroduce() は 「共通の紹介」 + 「個別の紹介」 を実行するためのメソッド
	public void execIntroduce(){
		commonIntroduce	();
		eachIntroduce();
	}
}
