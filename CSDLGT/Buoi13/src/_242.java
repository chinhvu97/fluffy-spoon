import java.util.Arrays;

public class _242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] countS = new int[26];
        int[] countT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int charS = s.charAt(i);
            int charT = t.charAt(i);
            countS[charS-97] ++;
            countT[charT-97] ++;
        }
        for (int i = 0; i < countS.length; i++) {
            if (countS[i] != countT[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
