import java.util.*;

public class _819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] splits = paragraph.toLowerCase().split("[ ,;!?'.]+");
        Set<String> bans = new HashSet<>();
        Collections.addAll(bans, banned);
        HashMap<String, Integer> count = new HashMap<>();
        for (String split : splits) {
            if (!bans.contains(split)) {
                count.put(split, count.getOrDefault(split, 0) + 1);
            }
        }
        Set<String> keys = count.keySet();
        int max = Integer.MIN_VALUE;
        String result = "";
        for (String key : keys) {
            if (count.get(key) > max) {
                max = count.get(key);
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
            String paragraph = "Bob hit a ball, the; hit! BALL? flew far after it was hit.";
            String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph,banned));
    }
}
