
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 14465 : 소가 길을 건너간 이유 5
 * https://www.acmicpc.net/problem/14465
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        Arrays.fill(arr, 1);

        for (int i = 0; i < B; i++){
            arr[Integer.parseInt(br.readLine())-1] = 0;
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int target = K-sum;
        for (int i = K; i < N; i++){
            sum += arr[i] - arr[i-K];
            if(sum <= K){
                target = Math.min(K-sum, target);
            }

        }
        System.out.println(target);
    }
}