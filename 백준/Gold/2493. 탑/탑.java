import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      int n = Integer.parseInt(st.nextToken());
      arr[i] = n;
    }

    int[] result = new int[N];
    Deque<Integer> dq = new ArrayDeque<>();
    for (int i = N - 1; i >= 0; i--) {
      while (!dq.isEmpty() && arr[i] >= arr[dq.peek()]) {
        int n = dq.pop();
        result[n] = i + 1;
      }
      dq.push(i);
    }

    while (!dq.isEmpty()) {
      result[dq.pop()] = 0;
    }

    StringBuilder sb = new StringBuilder();
    for (int num : result) {
      sb.append(num).append(' ');
    }
    System.out.println(sb.toString().trim());
    br.close();
  }
}
