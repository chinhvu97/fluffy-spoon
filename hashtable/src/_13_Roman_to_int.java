import java.util.HashMap;
import java.util.Set;

public class _13_Roman_to_int {


    public static int romanToInt(String s) {
        HashMap<Character, Integer> rom = new HashMap<>();
        rom.put('I', 1);rom.put('V', 5);
        rom.put('X', 10);rom.put('L', 50);
        rom.put('C', 100);rom.put('D', 500);rom.put('M', 1000);

        int[] values = new int[s.length()];

        for (int i = 0 ; i < s.length(); i ++) {
            values[i] = rom.get(s.charAt(i));
        }
        int result = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i+1]) {
                result -= values[i];
            } else {
                result += values[i];
            }
        }
        result += values[values.length - 1];
        return result;

    }

/* //Solution 1: slow
    public static int romanToInt(String s) {
        int result = 0;
        s = s + " ";
        HashMap<Character, Integer> normal = new HashMap<>();
        normal.put('I', 1);normal.put('V', 5);
        normal.put('X', 10);normal.put('L', 50);
        normal.put('C', 100);normal.put('D', 500);normal.put('M', 1000);

        HashMap<String, Integer> special = new HashMap<>();
        special.put("IV", 4);special.put("IX", 9);
        special.put("XL", 40);special.put("XC", 90);
        special.put("CD", 400);special.put("CM", 900);

        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.substring(i, i + 2);
            if (special.containsKey(temp)) {
                result += special.get(temp);
                i++;
            } else {
                result += normal.get(s.charAt(i));
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }
}
