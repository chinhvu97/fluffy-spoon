import java.util.*;

public class _506 {
    public static String[] findRelativeRanks(int[] score) {
        List<Integer> sortList = new ArrayList<>();
        for (int i : score) {
            sortList.add(i);
        }
        sortList.sort(Collections.reverseOrder());
        HashMap<Integer, Integer> convert = new HashMap<>();
        for (int i = 0; i < sortList.size(); i++) {
            convert.put(sortList.get(i), i+1);
        }
        System.out.println(convert);
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = convert.get(score[i]) + "";
            if (result[i].equals("1")) {
                result[i] = "Gold Medal";
            } else if (result[i].equals("2")) {
                result[i] = "Silver Medal";
            } else if (result[i].equals("3")) {
                result[i] = "Bronze Medal";
            }
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        findRelativeRanks(score);
    }
}
