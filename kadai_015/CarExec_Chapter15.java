package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//車のインスタンスを作成
		Car_Chapter15 car=new Car_Chapter15();

		//車クラスのgearChangeメゾットを実行する
		//「ギア1から3に切り替えました」が表示される
		car.gearChange(3);

		//車クラスのrunメゾットを実行する
		//「速度は時速30kmです」が表示される
		car.run();
	}

}
