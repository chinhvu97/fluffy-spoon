package homework;

import java.util.*;

public class _389_find_the_difference {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> s_count = new TreeMap<>();
        Map<Character, Integer> t_count = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            s_count.put(s.charAt(i), s_count.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            t_count.put(t.charAt(i), t_count.getOrDefault(t.charAt(i), 0) + 1);
        }

        Set<Character> keys =  t_count.keySet();
        char result = 0;
        for (Character key : keys) {
            // countS.get(key) return null on the finding key;
            if (!Objects.equals(s_count.get(key), t_count.get(key))){
                result = key;
                break;
            };
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "bcde";
        String t = "abcd";
        System.out.println(findTheDifference(s, t));
    }
}
