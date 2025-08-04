import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i< N; i++){
            String s = br.readLine();
            map.put(s, String.valueOf(i+1));
            map.put(String.valueOf(i+1), s);
        }

        for (int i = 0; i< M; i++){
            String s = br.readLine();
            if (map.containsKey(s)){
                System.out.println(map.get(s));
            }
        }


    }
}