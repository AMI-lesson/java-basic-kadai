package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 指定された固定の英単語リスト
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // 各単語を辞書で検索して結果を表示
        for (String word : wordsToSearch) {
            String result = dictionary.searchWord(word);
            System.out.println(result);
        }
    }
}
