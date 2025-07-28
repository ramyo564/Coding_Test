import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < target.length(); i++) {
            arr[target.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}