import java.util.HashSet;
import java.util.Set;

public class _840_Unique_Morse_Code {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] converts = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-."
                ,"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> distinct = new HashSet<>();
        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 97;
                temp.append(converts[index]);
            }
            distinct.add(temp.toString());
        }
        return distinct.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"})); ;
    }
}
