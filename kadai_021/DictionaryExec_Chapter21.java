//辞書クラスを実行するクラス
package kadai_021;

import java.util.Scanner;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
    	//辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        //System.in は Java において 標準入力 (Standard Input) を表す InputStream オブジェクト
        //キーボードからの入力 を受け取るために使用
        Scanner scanner = new Scanner(System.in);

        System.out.println("調べたい英単語を入力してください（終了するには'quit'を入力）:");

        //調べる英単語を配列にセットする
        //プログラムが強制的に停止されるか break が実行されるまで、無限に処理を繰り返す
        while (true) {
        	System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            //ユーザーが "quit" を入力したらループを抜ける (break する) ことで、プログラムを終了
            if (input.equals("quit")) {
                System.out.println("辞書検索を終了します。");
                break;
            }

            // 辞書を検索して結果を出力
            String result = dictionary.searchWord(input);
            System.out.println(result);
        }

        scanner.close();
    }
}
