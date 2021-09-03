package August;

import java.util.Arrays;

public class _238_product_except_self {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] array = new int[n];

        left[0] = 1;
        for (int i = 1; i< n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        for (int i = 0; i < array.length; i ++) {
            array[i] = left[i] * right[i];
        }

    return array;
    }
    public static void main(String[] args) {

    }
}
