import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int r = N-1;
        int l = 0;
        int ret = 0;

        while (r != l){
            if (arr[r] + arr[l] == K){
                ret ++;
                l++;
            }
            else if (arr[r] + arr[l] < K){
                l++;
            }
            else {
                r--;
            }
        }
        
        System.out.println(ret);

    }
}