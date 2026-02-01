
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1806 : 부분합
 * https://www.acmicpc.net/problem/1806
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int left = 0, right = 0, curLen = 0, sum = 0, ans = 100_001;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (sum <= S && right < N) {
                sum += arr[right++];
                curLen++;
            } else {
                if (right == left) {
                    break;
                }
                sum -= arr[left++];
                curLen--;
            }
            if (sum >= S) {
                ans = Math.min(curLen, ans);
            }
        }

        if (ans == 100_001){
            System.out.println(0);
        }else {
            System.out.println(ans);
        }

    }
}