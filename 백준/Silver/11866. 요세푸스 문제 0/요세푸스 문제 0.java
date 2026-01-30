
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {
            q.add(i);
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!q.isEmpty()) {
            if (cnt < K-1) {
                q.add(q.poll());
                cnt++;
                continue;
            }

            cnt = 0;
            int temp = q.poll();
            if (q.isEmpty()) {
                sb.append(temp);
                sb.append(">");
            } else {
                sb.append(temp);
                sb.append(", ");
            }


        }

        System.out.println(sb.toString());
        br.close();
    }
}
