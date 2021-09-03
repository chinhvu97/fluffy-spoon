package September;


/*
Valid Mountain Array
 */
public class _941 {

    public static boolean validMountainArray(int[] arr) {

        int indexTop = -1;
        if (arr.length < 3 || arr[1] <= arr[0]) return false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) return false;
            if (arr[i] < arr[i-1]) {
                indexTop = i-1;
                break;
            }
        }
//        System.out.println(indexTop);
        if (indexTop == -1) {
            return false;
        } else {//top exists
            for (int i = indexTop + 1; i < arr.length; i++) {
                if (arr[i] >= arr[i-1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0,3};
        System.out.println(validMountainArray(arr));
    }
}
