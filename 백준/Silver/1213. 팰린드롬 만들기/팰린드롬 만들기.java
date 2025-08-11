import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        int[] arr = new int[26];
        for (int i = 0; i < temp.length(); i++) {
            arr[temp.charAt(i) - 'A']++;
        }
        char center = ' ';
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                center = (char) (i + 'A');
                cnt++;
            }
        }
        String ret = "";
        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < arr[i] / 2; j++) {
                ret += (char) (i + 'A');
            }
        }
        String rev = "";
        for (int i = ret.length() - 1; i >= 0; i--) {
            rev += ret.charAt(i);
        }
        if (cnt > 1){
            System.out.println("I'm Sorry Hansoo");
        }else if (center == ' '){
            System.out.println(ret+rev);
        }else{
            System.out.println(ret+center+rev);
        }

    }
}