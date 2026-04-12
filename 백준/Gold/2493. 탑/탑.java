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

    Deque<Integer> dq = new ArrayDeque<>();
    int[] result = new int[N];
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