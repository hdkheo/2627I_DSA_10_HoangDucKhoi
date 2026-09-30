package Week3;

import java.io.*;
import java.util.*;

public class Bai4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int q = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> types = new ArrayDeque<>();
        Deque<String> data = new ArrayDeque<>();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());

            if (t == 1) {
                String w = st.nextToken();
                sb.append(w);
                types.push(1);
                data.push(w);
            } else if (t == 2) {
                int k = Integer.parseInt(st.nextToken());
                int start = sb.length() - k;
                String removed = sb.substring(start);
                sb.setLength(start);
                types.push(2);
                data.push(removed);
            } else if (t == 3) {
                int k = Integer.parseInt(st.nextToken());
                out.append(sb.charAt(k - 1)).append('\n');
            } else {
                int lastType = types.pop();
                String d = data.pop();
                if (lastType == 1) {
                    sb.setLength(sb.length() - d.length());
                } else {
                    sb.append(d);
                }
            }
        }

        System.out.print(out);
    }
}