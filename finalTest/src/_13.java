import java.util.HashMap;

public class _13 {
    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> convert = new HashMap<>();
        convert.put('I', 1);
        convert.put('V', 5);
        convert.put('X', 10);
        convert.put('L', 50);
        convert.put('C', 100);
        convert.put('D', 500);
        convert.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            char cur = s.charAt(i);
            char next = s.charAt(i + 1);
            if (convert.get(cur) < convert.get(next)) {
                result -= convert.get(cur);
            } else {
                result += convert.get(cur);
            }
        }
        result += convert.get(s.charAt(s.length() - 1));
        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
