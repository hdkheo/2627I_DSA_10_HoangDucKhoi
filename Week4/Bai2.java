package Week4;

public class Bai2 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = minIdx;
            arr[minIdx] = arr[i];
            arr[i] = arr[temp];
        }
    }
}
