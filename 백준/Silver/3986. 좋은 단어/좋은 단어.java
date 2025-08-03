import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int N = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int ret = 0;
        for (int i = 0; i < N; i++){
            String s = br.readLine();
            Stack<Character> st = new Stack<>();
            for (int j = 0; j < s.length(); j++){
                if (st.empty() || st.peek() != s.charAt(j)){
                    st.push(s.charAt(j));
                }else{
                    st.pop();
                }
            }
            if (st.empty()){
                ret++;
            }
        }
        
        System.out.println(ret);


    }
}