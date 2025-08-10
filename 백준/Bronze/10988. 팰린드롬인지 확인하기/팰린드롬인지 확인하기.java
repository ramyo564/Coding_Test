import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ret = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = ret.length() - 1; i >= 0; i--) {
            sb.append(ret.charAt(i));
        }

        if (ret.equals(sb.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}