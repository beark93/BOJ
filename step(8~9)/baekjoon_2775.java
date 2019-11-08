/**
 * baekjoon_2775
 */
import java.io.*;

public class baekjoon_2775 {
    public static void main(String[] args) throws Exception {
        int[][] apt = new int[15][15];

        for(int i=1;i<15;i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(String.valueOf(solution(k,n,apt)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int solution(int k, int n, int[][] apt) {
        int x=0;

        if(apt[k][n] != 0) return apt[k][n];
        for(int i=1;i<=n;i++) x += solution(k-1,i,apt);

        return apt[k][n] = x;
    }
}