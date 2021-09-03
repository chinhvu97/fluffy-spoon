import java.util.Arrays;


/**
 * leetcode 283
 */
public class MoveZeroes {

/*    public static void moveZeroes(int[] nums) {
        int index = 0;
        int end = nums.length - 1;
        while (index <= end) {
            if (nums[index] == 0) {
                System.arraycopy(nums, index + 1, nums, index, end - index);
                end--;
            } else {
                index ++;
            }
        }
        for (int i = end + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }*/

    public static void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num!=0) {
                arr[index] = num;
                index++;
            }
        }
        System.arraycopy(arr, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1,2,0,0,5};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
