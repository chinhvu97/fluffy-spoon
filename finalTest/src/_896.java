public class _896 {
    public  static boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) return true;
        boolean isIncrease = false;
        boolean isDecrease = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] > 0) {
                isIncrease = true;
            } else if (nums[i] - nums[i-1] < 0) {
                isDecrease = true;
            }
            if (isDecrease && isIncrease) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(isMonotonic(nums));
    }
}
