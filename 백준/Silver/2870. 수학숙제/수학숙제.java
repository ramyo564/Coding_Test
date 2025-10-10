import java.io.*;
import java.util.*;

public class Main {

    static String ret = "";
    static ArrayList<String> arr;

    static void go(){
        while(true){
            if(!ret.isEmpty() && ret.charAt(0) == '0'){
                ret = ret.substring(1);
            }else {
                break;
            }
        }
        if (ret.length() == 0){
            ret = "0";
        }
        arr.add(ret);
        ret = "";

    }

    public static void main(String[] args) throws IOException {
        arr = new ArrayList<>(); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String temp = br.readLine();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            
            for (int r = 0; r < temp.length(); r++) {
                if(temp.charAt(r) < 65){
                    ret += temp.charAt(r);
                }
                else if (!ret.isEmpty()){
                    go();
                }
            }
            if(!ret.isEmpty()){
                go();
            }
        }
        
        Collections.sort(arr, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length()); // 길이가 짧은 순서
            }
            return a.compareTo(b); // 길이가 같으면 사전순 비교
        });

        for (String s: arr){
            System.out.println(s);
        }
    }
}