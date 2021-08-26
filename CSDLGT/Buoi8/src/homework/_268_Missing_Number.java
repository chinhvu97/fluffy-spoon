package homework;

import java.util.HashSet;
import java.util.Set;

public class _268_Missing_Number {
    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {0,1,2};
        System.out.println(missingNumber(num));
    }
}
