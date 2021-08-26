package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1346_double_exists {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int countZero = 0;
        for (int num : arr) {
            if (num != 0) {
                set.add(num);
            } else {
                countZero++;
            }
        }
        for (int num : arr) {
            if (set.contains(num * 2 )) {
                return true;
            }
        }

        //if zeros count = 2 -> 2 * 0 = 0 true
        return countZero > 1;
    }

    public static void main(String[] args) {
        int[] nums = {-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist(nums));
    }
}
