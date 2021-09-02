import java.util.Arrays;

public class _557_Reverse_String_3 {
    public static String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >=0; i--) {
            reverse.append(s.charAt(i));
        }
        String[] splits = reverse.toString().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = splits.length - 1; i >= 0; i--) {
            result.append(splits[i]).append(" ") ;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)) ;
    }
}
