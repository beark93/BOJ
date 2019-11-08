/**
 * baekjoon_10250
 */
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_10250 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<t;i++) {
            st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            // 101,201,...,h01,201,... 순서로 배정
            // h로 나눈 나머지가 층수 -> 나누어 떨어지면 최상층
            if(n%h == 0) bw.write(String.valueOf(h*100 + n/h));
            else bw.write(String.valueOf((n%h)*100 + (n/h+1)));
            bw.newLine();
        }

        bw.flush();
    }
}