import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String ret = "";

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) <= 'Z' && st.charAt(i) >= 'A') {
                ret += (char) ((st.charAt(i) - 'A' + 13) % 26 + 'A');
            }
            else if (st.charAt(i) <= 'z' && st.charAt(i) >= 'a') {
                ret += (char) ((st.charAt(i) - 'a' + 13) % 26 + 'a');
            }
            else{
                ret += st.charAt(i);
            }
        }
        System.out.println(ret);

    }
}