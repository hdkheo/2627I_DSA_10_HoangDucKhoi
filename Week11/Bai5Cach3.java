package Week11;

import java.util.ArrayList;
import java.util.List;

public class Bai5Cach3 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        int minVal = Integer.MAX_VALUE;
        for (int num : brr) {
            if (num < minVal) {
                minVal = num;
            }
        }

        int[] count = new int[101];

        for (int num : brr) {
            count[num - minVal]++;
        }
        for (int num : arr) {
            count[num - minVal]--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                result.add(i + minVal);
            }
        }

        return result;
    }
}
