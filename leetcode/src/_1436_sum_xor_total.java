import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1436_sum_xor_total {

    int sum = 0;
    public int subsetXORSum(int[] nums) {
        int[] choices = {0, 1};
        int[] combine = new int[nums.length];
        int sum = 0;
        sum = backtrack(0, nums, combine, choices);
        return sum;
    }

    private int backtrack(int index, int[] nums, int[] combine, int[] choice) {
        for (int i = 0; i < choice.length; i++) {
            combine[index] = (choice[i]);
            if (index == nums.length - 1) {
                sum += process(combine, nums);
//                System.out.println(Arrays.toString(combine));
            } else {
                backtrack(index + 1, nums, combine, choice);
            }
        }
//        System.out.println(sum);
        return sum;
    }

    private int process(int[] combine, int[] nums) {
        int calculate = 0;
        for (int i = 0; i < combine.length; i++) {
            if (combine[i] == 1) {
                calculate = calculate ^ nums[i];
            }
        }
        System.out.println(calculate);
        return calculate;
    }

}
