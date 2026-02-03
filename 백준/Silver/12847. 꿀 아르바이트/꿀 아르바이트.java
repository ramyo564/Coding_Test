
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 12847 : 꿀 아르바이트
 * https://www.acmicpc.net/problem/12847
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long ans = 0, temp = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M ; i++){
            temp += arr[i];
        }
        ans = temp;
        for ( int i = M; i < N; i++){
            temp += arr[i] - arr[i-M];
            ans = Math.max(ans, temp);
        }

        System.out.println(ans);

    }
}