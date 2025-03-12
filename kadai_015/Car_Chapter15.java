package kadai_015;

//Step2. 車クラスを作成する
public class Car_Chapter15 {


	//1速から5速のギアを表す
	private int gear=1;
	//ギアチェンジ後の速度を表す
	private int speed=10;

	//ギアの値により速度を変える
	public void gearChange(int afterGear){
		//this.gear はクラスのフィールド（変数）gear を指す。
		//afterGear で渡された値を gear に代入し、ギアを変更する。
		//this をつけることで、ローカル変数 afterGear ではなく、クラスの gear を明示。
		this.gear=afterGear;
		switch(afterGear){
			case 1:
				this.speed=10;
				break;
			case 2:
				this.speed=20;
				break;
			case 3:
				this.speed=30;
				break;
			case 4:
				this.speed=40;
				break;
			case 5:
				this.speed=50;
				break;
			default:
				this.speed=10;
				break;
		}
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました。");

	}

	//ギアチェンジ後の速度を表示する
	public void run(){
		System.out.println("速度は時速"+speed+"です");
	}

}
