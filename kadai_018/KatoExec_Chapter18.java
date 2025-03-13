package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {

    	// 各子クラスのインスタンスを作成（それぞれに住所を渡す）
        String address = "東京都中野区〇×";

        // 各子クラスのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(address);
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(address);
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(address);

        // execIntroduceメソッドを呼び出して情報を表示
        taro.execIntroduce();
        System.out.println(); // 空行を入れることで見やすくします
        ichiro.execIntroduce();
        System.out.println();
        hanako.execIntroduce();
    }
}