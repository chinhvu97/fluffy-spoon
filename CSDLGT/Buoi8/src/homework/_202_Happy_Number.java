package homework;

import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (!nums.contains(sumSquare(n))) {
            n = sumSquare(n);
            if (n != 1) {
                nums.add(n);
            } else {
                return true;
            }
        }
        return false;
    }

    public static int sumSquare(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10) * (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
