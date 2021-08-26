package homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _648_Replace_Word {
    /**
     * set dictionary, split sentence to words
     * with each word, check its substring with dictionarySet
     * if contains, add root; else add original word
     */
    public static String replaceWords(List<String> dictionary, String sentence) {

        Set<String> dictionarySet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int index = 1;
            String temp = word.substring(0,index);
            String root = "";

            while (temp.length() < word.length()) {
                if (dictionarySet.contains(temp)) {
                    root = temp;
                    break;
                }
                // not contain
                temp = word.substring(0, ++index);

            }

            if (root.length() == 0) {
                result.append(word).append(" ");
            } else {
                result.append(root).append(" ");
            }

        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
       List<String> dictionary = List.of("cat","ca", "bat","rat");
       String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }
}
