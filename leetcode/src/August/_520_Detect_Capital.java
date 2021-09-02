package August;

public class _520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {

        int N = word.length();
        int countUppercase = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.charAt(i) < 97) {
                countUppercase++;
            }
        }

        if (countUppercase == 0) return true;
        else if (countUppercase == 1) {
            return (int) word.charAt(0) < 97;
        } else return countUppercase == N;
    }

    public static void main(String[] args) {
        String s = "usa";
        System.out.println(detectCapitalUse(s));
    }
}
