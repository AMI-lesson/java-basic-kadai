package kadai_021;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary_Chapter21 {

	//辞書クラスを作成
	//HashMapを宣言
	//キーの型	値の型	用途
	//String	String	英単語の辞書として機能する
    private HashMap<String, String> dictionary;


    //10通りの英単語と意味を追加
    // コンストラクタで辞書を初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    //繰り返し処理を使い、調べる英単語が辞書に追加されているか判定
    // 単語を検索するメソッド
    public String searchWord(String word) {
    	if (dictionary.containsKey(word)) {
            return word + "の意味は" + dictionary.get(word);
        } else {
            return word + "は辞書に存在しません";
        }
    }
}
