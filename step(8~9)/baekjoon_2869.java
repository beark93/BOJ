/**
 * baekjoon_2869
 */
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_2869 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // a + (a-b)(n-1) > v  
        System.out.println((int)Math.ceil((double)(v-b)/(a-b)));
    }
}