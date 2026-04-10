import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    // 오른쪽 수가 현재보다 크면 넣는다
    // 없으면 -1
    // 현재 idx 보다 오른쪽이 크면서 가장 왼쪽에 있는 수를 넣는다

    // 현재 숫자보다 오른쪽 숫자가 클 경우를 확인하는 상태 arr 필요
    boolean[] status = new boolean[N];
    // 바로 이전꺼 확인하기
    Stack<Integer> stack = new Stack<>();
    // 정답 arr
    int[] answer = new int[N];

    for (int i = 0; i < arr.length; i++) {
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        int idx = stack.peek();
        // 가장 왼쪽 수가 한 번이라도 갱신되면 진행 못하도록 가드
        if (!status[idx]) {
          status[idx] = true;
          answer[idx] = arr[i];
          stack.pop();
        }
      }
      stack.push(i);
    }

    // 큰 수가 없을 경우 -1 처리
    while (!stack.isEmpty()) {
      int idx = stack.pop();
      answer[idx] = -1;
    }
    // 출력 성능을 위해 StringBuilder 사용
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(answer[i]).append(' ');
    }

    System.out.println(sb.toString().trim());
    br.close();
  }
}
