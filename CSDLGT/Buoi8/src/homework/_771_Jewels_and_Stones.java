package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _771_Jewels_and_Stones {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jews = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            jews.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (jews.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "a";
        String stones = "aAaBA";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
