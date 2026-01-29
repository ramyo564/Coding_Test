
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int d_value = 1;
        // 데크 초기화
        for (int i = 0; i < N; i++) {
            deque.addLast(d_value++);
        }
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            // N = 문서 갯수 / M = 언제 출력 되는지 알아내고 싶은 문서의 위치
            int target_num = Integer.parseInt(st.nextToken());
            arr[i] = target_num;
        }
        int total_rot = 0;
        int target_idx = 0;

        while (target_idx < arr.length) {
            int cur = deque.peekFirst();

            if (cur == arr[target_idx]) {
                deque.removeFirst();
                target_idx++;
                if (target_idx == arr.length) {
                    System.out.println(total_rot);
                    break;
                }
            } else {
                // 1. 목표 위치 찾기
                int target_pos = 0;
                for (int i : deque) {

                    if (i == arr[target_idx]) {
                        break;
                    }
                    target_pos++;
                }

                // 2. 좌우 회전 비교
                int left_rot = target_pos;
                int right_rot = deque.size() - target_pos;

                // 3. 최소 회전 실행
                if (left_rot <= right_rot) {
                    deque.addLast(deque.removeFirst());  // 왼쪽 회전
                } else {
                    deque.addFirst(deque.removeLast());  // 오른쪽 회전
                }
                total_rot++;  // 무조건 +1
            }

        }


        br.close();
    }
}
