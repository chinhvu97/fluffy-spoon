import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _219_Contains_Duplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int temp = nums[i];
            if (elements.containsKey(temp)) {
                if (i - elements.get(temp) <= k) return true;
                else {
                    elements.put(temp, i);
                }
            } else {
                elements.put(temp, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums  = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
