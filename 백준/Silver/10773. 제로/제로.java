
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int total = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i ++){
            int temp = Integer.parseInt(br.readLine());
            if (temp > 0){
                st.push(temp);
                total += temp;
            } else if(!st.isEmpty()) {
                total -= st.pop();
            }
        }


        System.out.println(total);

        br.close();
    }
}
