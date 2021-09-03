import java.util.HashSet;
import java.util.Set;

public class _824 {
    public static String toGoatLatin(String sentence) {
        String[] splits = sentence.split(" ");
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('i');
        vowels.add('u');vowels.add('e');
        vowels.add('o');vowels.add('A');
        vowels.add('I');vowels.add('U');
        vowels.add('E');vowels.add('O');

        StringBuilder result = new StringBuilder();
        int addA = 1;
        for (String word : splits) {
            if (vowels.contains(word.charAt(0))) {
                result.append(word).append("ma");
            } else {
                String slice = word.substring(1);
                slice += word.charAt(0) + "";
                result.append(slice).append("ma");
            }
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < addA; i++) {
                temp.append("a");
            }
            addA++;
            result.append(temp).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }
}
