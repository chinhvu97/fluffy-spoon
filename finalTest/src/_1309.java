import java.util.Arrays;

public class _1309 {
    public static String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();

        if (chars.length <= 2) { //no #
            for (int i = 0; i < s.length(); i++) {
                int temp = Integer.parseInt(String.valueOf(s.charAt(i))) + 96;
                char c = (char) temp;
                result.append(c);
            }
        } else {
            for (int i = chars.length - 1; i >= 2; i--) {
                if (chars[i] == '#') { //only back 2;
                    int temp = Integer.parseInt(chars[i - 2] + String.valueOf(chars[i-1]));
                    char c = (char) (temp + 96);
                    chars[i] = c;
                    chars[i-1] = 'A';
                    chars[i-2] = 'A';
                    i = i - 2;
                } else {
                    int temp = Integer.parseInt(String.valueOf(chars[i])) + 96;
                    chars[i] = (char) temp;
                }
            }
            if (s.charAt(2) != '#') {
                int temp0 = Integer.parseInt(String.valueOf(s.charAt(0))) +96;
                chars[0] = (char) temp0;
                int temp1 = Integer.parseInt(String.valueOf(s.charAt(1))) +96;
                chars[1] = (char) temp1;
            }
            if (s.length() >3 && s.charAt(3) == '#') {
                chars[1] = 'A';
            }
        }

        for (char c : chars) {
            if (c >= 97) {
                result.append(c);
            }
        }
        System.out.println(Arrays.toString(chars));
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "824#15#826#";
        System.out.println(freqAlphabets(s));
    }
}
