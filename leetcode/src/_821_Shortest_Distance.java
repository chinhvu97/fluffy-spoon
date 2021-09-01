import java.util.Arrays;

public class _821_Shortest_Distance {

    public static int[] shortestToChar(String s, char c) {

        int[] result = new int[s.length()];
        int prev = -100000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) prev = i;
            result[i] = i - prev;
        }
        prev = 1000000;
        for (int i = s.length() - 1; i >= 0; i --) {
            if (s.charAt(i) == c) prev = i;
            result[i] = Math.min(prev - i, result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        shortestToChar(s, 'e');

    }
}
