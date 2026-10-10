package Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void insertionSort1(int n, List<Integer> arr) {
        int target = arr.get(n - 1);
        int i = n - 2;

        while (i >= 0 && arr.get(i) > target) {
            arr.set(i + 1, arr.get(i));
            printList(arr);
            i--;
        }

        arr.set(i + 1, target);
        printList(arr);
    }

    private static void printList(List<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.size(); j++) {
            sb.append(arr.get(j));
            if (j < arr.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

public class Bai3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
