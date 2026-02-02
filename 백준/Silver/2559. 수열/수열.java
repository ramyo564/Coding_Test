
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 백준 2559 : 수들의 합
 * https://www.acmicpc.net/problem/2559
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int ans = 0, temp = 0, left = 0, right = K;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (K == 1) {
            Arrays.sort(arr);
            System.out.println(arr[N - 1]);
        } else {
            for (int i = 0; i < K; i++) {
                temp += arr[i];
            }

            ans = temp;
            while (right < N) {
                temp = temp - arr[left++] + arr[right++];
                ans = Math.max(ans, temp);
            }

            System.out.println(ans);

        }


    }
}