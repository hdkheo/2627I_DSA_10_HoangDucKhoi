package Week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai5Cach2 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < brr.size()) {
            if (i < arr.size() && arr.get(i).equals(brr.get(j))) {
                i++;
                j++;
            } else {
                int missing = brr.get(j);
                if (result.isEmpty() || result.get(result.size() - 1) != missing) {
                    result.add(missing);
                }
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));

        System.out.println(missingNumbers(arr, brr));
    }
}