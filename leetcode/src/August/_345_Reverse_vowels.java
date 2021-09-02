package August;

import java.util.*;

public class _345_Reverse_vowels {

    public static String reverseVowels(String s) {
        if (s.length() == 1) return s;
        char[] chars = new char[s.length()];
        List<Character> vowel = Arrays.asList('a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O');
        Set<Character> vowels = new HashSet<>(vowel);
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            while (left < right && !vowels.contains(s.charAt(left))) {
                chars[left] = s.charAt(left);
                left++;
            }
            while (left < right && !vowels.contains(s.charAt(right))) {
                chars[right] = s.charAt(right);
                right--;
            }
                chars[left] = s.charAt(right);
                chars[right] = s.charAt(left);
                left++;
                right--;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("u u"));;
        String s = " ";
        System.out.println(s.charAt(0));
    }
}
