import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0, sum = 0, left = 0, right = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        while (true) {
            if (sum >= M) {              
                if (sum == M) cnt++;     
                sum -= arr[left++];
            } else {                     
                if (right == N) break;   
                sum += arr[right++];
            }
        }

        System.out.println(cnt);

    }
}