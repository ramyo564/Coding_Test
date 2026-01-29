import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        class Q {
            final int paper_priority;
            final int idx;

            Q(int paper_priority, int idx) {
                this.paper_priority = paper_priority;
                this.idx = idx;
            }
        }

        // 테스트 갯수
        int X = Integer.parseInt(br.readLine());

        for (int i = 0; i < X; i++) {
            // N = 문서 갯수 / M = 언제 출력 되는지 알아내고 싶은 문서의 위치
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int q_idx = 0;
            int printed_cnt = 0;
            int maxP = 0;

            Queue<Q> q = new LinkedList<>();

            StringTokenizer paper = new StringTokenizer(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();


            for (int r = 0; r < N; r++) {
                int num = Integer.parseInt(paper.nextToken());
                q.add(new Q(num, q_idx));
                arr.add(num);
                q_idx++;
            }
            arr.sort(Collections.reverseOrder());
            maxP = arr.get(0);

            while (true) {
                Q temp = q.peek();
                if (temp.paper_priority < maxP) {
                    q.add(q.poll());
                    continue;
                }

                q.poll();
                arr.remove(0);
                if (!arr.isEmpty()) {
                    maxP = arr.get(0);
                }

                printed_cnt++;
                if (temp.idx == M) {
                    System.out.println(printed_cnt);
                    break;
                }

            }


        }

        br.close();
    }
}
