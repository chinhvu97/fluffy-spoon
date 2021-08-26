import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums) {
            if (elements.contains(num)) return true;
            else {
                elements.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
