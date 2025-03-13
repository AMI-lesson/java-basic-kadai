package kadai_018;

//加藤花子を表すクラス
public class KatoHanako_Chapter18 extends Kato_Chapter18{
	public KatoHanako_Chapter18(String address){
		super("加藤","",address);
		setGivenName();
	}

	public void setGivenName(){
		this.givenName="花子";
	}
	public void eachIntroduce(){
		System.out.println("趣味は読書です");
	}


}
