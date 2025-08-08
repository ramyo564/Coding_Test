import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int ret = 0, temp = 0;
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            arr[i] = num;
        }

        for (int i = 0; i < K; i++) {
            ret += arr[i];
        }
        temp = ret;
        int j = 0;
        for ( int i = K; i < N; i++){
            temp = temp - arr[j] + arr[i];
            if (ret < temp){
                ret = temp;
            }
            j++;
        }
        System.out.println(ret);
    }
}