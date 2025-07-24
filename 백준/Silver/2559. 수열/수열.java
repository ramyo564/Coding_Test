import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int temp = 0, ret = 0, startIdx = 0;

        int[] arr = new int[100001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < K; i++) {
            ret += arr[i];
        }

        temp = ret;
        for (int i = K; i < N; i++) {
            temp = temp - arr[startIdx] + arr[i];
            if (temp > ret) {
                ret = temp;
            }
            startIdx += 1;
        }

        System.out.println(ret);

    }
}
