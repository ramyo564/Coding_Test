import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[101];
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3 ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            for (int j = start + 1; j <= end; j++){
                arr[j] ++;
            }
        }

        int ret = 0;
        for (int i = 0; i < 101; i++){
            if (arr[i] == 3){
                ret += arr[i] * C;
            }
            else if (arr[i] == 2){
                ret += arr[i] * B;
            }
            else if (arr[i] == 1){
                ret += arr[i] * A;
            }
        }

        System.out.println(ret);


    }
}