import java.util.Arrays;
import java.util.HashMap;

public class _888_Fair_Candy_Swap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        for (int candy : aliceSizes) {
            sumAlice += candy;
        }
        for (int candy : bobSizes) {
            sumBob += candy;
        }
        int difference = (sumAlice - sumBob) / 2;

        HashMap<Integer, Integer> matches = new HashMap<>();
        for (int candy : aliceSizes) {
            matches.put(candy - difference, candy);
        }
        int[] result = new int[2];
        for (int candy : bobSizes) {
            if (matches.containsKey(candy)) {
                result[0] = matches.get(candy);
                result[1] = candy;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] alices = {1,2,5};
        int[] bob = {2,4};
        System.out.println(Arrays.toString(fairCandySwap(alices, bob)));
    }
}
