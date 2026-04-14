import java.io.*;
import java.util.*;

/**
 * 백준 2493: 탑 https://www.acmicpc.net/problem/2493
 *
 * <p>[풀이 접근] 1. N개의 탑이 왼쪽부터 오른쪽으로 서 있고, 각 탑은 왼쪽 방향으로 레이저 신호를 발사한다. 2. 가장 먼저 만나는 높이가 더 높은 탑에서 신호를
 * 수신한다. 3. N이 최대 500,000이므로 O(N^2)은 시간 초과가 발생할 수 있다. 4. 스택을 사용하여 O(N)으로 해결한다: - 스택에는 현재 탑보다 왼쪽에 있는
 * 탑들 중 '잠재적으로 신호를 수신할 수 있는' 탑들을 저장한다. - 탑을 하나씩 확인하며: - 스택의 top 탑이 현재 탑보다 낮으면 pop (현재 탑이 더 높으므로 앞으로
 * 오는 탑들은 이 top 탑을 만날 일이 없음). - 스택이 비어있으면 수신할 탑이 없음 (0 출력). - 스택의 top 탑이 현재 탑보다 높으면 그 탑이 수신 탑임 (top의
 * 인덱스 출력). - 현재 탑을 스택에 push.
 *
 * <p>[시간복잡도] - O(N): 각 탑은 스택에 최대 한 번 push되고 pop됨.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 탑 높이 정보 배열
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // 정답 제출 배열
    int[] result = new int[N];

    Deque<Integer> dq = new ArrayDeque<>();
    for (int i = N - 1; i >= 0; i--) {
      while (!dq.isEmpty() && arr[dq.peek()] <= arr[i]) {
        int idx = dq.pop();
        result[idx] = i + 1;
      }
      dq.push(i);
    }

    while (!dq.isEmpty()) {
      result[dq.pop()] = 0;
    }


    StringBuilder sb = new StringBuilder();
    for (int i : result) {
      sb.append(i).append(' ');
    }

    System.out.println(sb.toString().trim());
  }
}