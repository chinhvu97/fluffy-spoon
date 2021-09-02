package September;


import java.util.Arrays;

/**
 * Number of good pair
 */
public class _1512 {
    public static int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
//        System.out.println(Arrays.toString(counts));
        int result = 0;
        for (int count : counts) {
            if (count >= 2) {
                for (int i = 1; i < count; i++) {
                    result += i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
