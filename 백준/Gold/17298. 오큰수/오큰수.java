import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      arr[i] = num;
    }

    Deque<Integer> dq = new ArrayDeque<>();
    int[] ans = new int[N];
    for (int i = 0; i < N; i++) {
      while (!dq.isEmpty() && arr[dq.peek()] < arr[i]) {
        int idx = dq.pop();
        ans[idx] = arr[i];
      }
      dq.push(i);
    }
    while (!dq.isEmpty()) {
      ans[dq.pop()] = -1;
    }
    StringBuilder sb = new StringBuilder();
    for (int i : ans) {
      sb.append(i).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}