package kadai_028;

import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter28 {

	//	自分のじゃんけんの手を入力する
	public String getMyChoice(){
		Scanner scanner = new Scanner(System.in);
		//自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String choice=scanner.nextLine();
		return choice;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){
		//配列にじゃんけんの手をセットする
		String[] hands={"r","s","p"};
		//乱数で対戦相手のじゃんけんの手を選ぶ
		int index = (int) Math.floor(Math.random() * 3);
		//じゃんけんクラスをじっくおするクラスに、対戦相手のじゃんけんを返す
		return hands[index];
	}

	//じゃんけんを行う
	public void playGame(String myChoice, String opponentChoice){
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");

		//自分と対戦相手のじゃんけんを出力する
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));

		//自分と対戦相手のじゃんけんの手を比較する
		//じゃんけんの結果を出力する
		//opponentChoiceは対戦相手の選んだじゃんけんの手
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if (
			//自分が「グー（r）」を出して、相手が「チョキ（s）」を出した → 自分の勝ち！
			//||はまたは
			(myChoice.equals("r") && opponentChoice.equals("s")) ||
			// 自分が「チョキ（s）」を出して、相手が「パー（p）」を出した → 自分の勝ち！
			(myChoice.equals("s") && opponentChoice.equals("p")) ||
			//自分が「パー（p）」を出して、相手が「グー（r）」を出した → 自分の勝ち！
			(myChoice.equals("p") && opponentChoice.equals("r"))
		) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}


