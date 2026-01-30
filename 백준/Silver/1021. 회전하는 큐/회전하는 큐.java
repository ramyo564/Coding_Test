
import java.io.*;
import java.util.*;

import static java.lang.Math.min;

/**
 * 백준 1966번: 프린터 큐
 * https://www.acmicpc.net/problem/1021
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int q_cnt = Integer.parseInt(st.nextToken());
        int target_cnt = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        // deque 초기화
        for (int i = 1; i < q_cnt + 1; i++) {
            deque.addLast(i);
        }

        // target 리스트 배열 만들기
        int[] targets_list = new int[target_cnt];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < target_cnt; i++) {
            targets_list[i] = Integer.parseInt(st.nextToken());
        }

        int total_rot = 0;
        int target_idx = 0;

        while (target_idx < targets_list.length) {
            int temp = deque.peekFirst();
            if (temp == targets_list[target_idx]) {
                deque.removeFirst();
                target_idx++;

            } else {
                // 오른쪽 왼쪽 결정하기 -> position 구하기
                int pos = 0;
                for (int t : deque) {
                    if (t == targets_list[target_idx]) {
                        break;
                    }
                    pos++;
                }

                // 오른 쪽은 pos
                int right = pos;

                // 왼쪽은 전체 데크 사이즈에서 pos 를 뺀 값
                int left = deque.size() - pos;

                if (right <= left){
                    for (int i = 0; i<right; i ++){
                        total_rot++;
                        deque.addLast(deque.removeFirst());
                    }

                }else {
                    for (int i = 0; i<left; i ++){
                        total_rot++;
                        deque.addFirst(deque.removeLast());
                    }

                }

            }
        }
        System.out.println(total_rot);
        br.close();
    }
}
