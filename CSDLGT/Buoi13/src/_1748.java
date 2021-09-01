import java.util.HashSet;
import java.util.Set;

public class _1748 {
    public static int sumOfUnique(int[] nums) {
        int[] counts = new int[101];
        for (int i = 0; i < nums.length; i ++) {
            counts[nums[i]] ++;
        }
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 1) sum+= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}
