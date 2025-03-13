package kadai_018;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	public KatoIchiro_Chapter18(String address){
		super("加藤","",address);
		setGivenName();
	}

	public void setGivenName(){
		this.givenName="一郎";
	}

	public void eachIntroduce(){
		System.out.println("私の好きな食べ物はリンゴです。");
	}

}
