import java.util.HashMap;
import java.util.Objects;

public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> s_count = new HashMap<>();
        HashMap<Character, Integer> t_count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            s_count.put(s.charAt(i), s_count.getOrDefault(s.charAt(i), 0) + 1);
            t_count.put(t.charAt(i), t_count.getOrDefault(t.charAt(i), 0) + 1);

            if (!Objects.equals(s_count.get(s.charAt(i)), t_count.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "papap";
        String t = "titii";
        System.out.println(isIsomorphic(s, t));


    }
}
