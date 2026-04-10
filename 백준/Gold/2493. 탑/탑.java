import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      arr[i] = num;
    }

    int[] answer = new int[N];

    for (int i = N - 1; i >= 0; i--) {
      while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
        int idx = stack.pop();
        answer[idx] = i + 1;
      }
      stack.push(i);
    }
    // 큰 수가 없을 경우 0 처리
    while (!stack.isEmpty()) {
      int idx = stack.pop();
      answer[idx] = 0;
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
