package August;

import java.util.*;

public class _859_Buddy_String {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        List<List<Character>> changes = new ArrayList<>();
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                List<Character> temp = Arrays.asList(s.charAt(i), goal.charAt(i));
                changes.add(temp);
                if (changes.size() > 2) return false;
            } else {
                int temp = s.charAt(i);
                counts[temp - 97] ++;
            }
        }
        System.out.println(Arrays.toString(counts));
        if (changes.size() == 0) {
            for (int count : counts) {
                if (count > 1) return true;
            }
        }
        if (changes.size() != 2) return false;
        else { //size = 2
            if (changes.get(0).get(0) != changes.get(1).get(1) ||
                    changes.get(0).get(1) != changes.get(1).get(0)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ab";
        System.out.println(buddyStrings(s, goal));
    }
}
