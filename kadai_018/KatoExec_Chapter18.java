package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {

        // 各子クラスのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

        // execIntroduce メソッドを呼び出して情報を表示
        taro.execIntroduce();
        System.out.println();
        ichiro.execIntroduce();
        System.out.println();
        hanako.execIntroduce();
    }
}
