/**
 * baekjoon_2292
 */
import java.io.*;

public class baekjoon_2292 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solve2(n));
    }

    public static double solve(int n) {
        // 1 + 6*1 + 6*2 + ... + 6*n -> 1 + 6n(n+1)/2 : 등차수열의 합
        // x^2 + x -(n-1)/3 = 0 : 근의공식 
        if(n == 1) return 1;
        return ((Math.sqrt(1 + ((double)(n-1)-1)*4/3) - 1) / 2) + 2;
    }

    public static int solve2(int n) {
        // a(1) = 1
        if(n == 1) return 1;

        // 1 + 6*1 + 6*2 + ... + 6*n
        // a(n) = a(n-1) + 6*(n-1)
        int i = 1;
        int k = 1;
        while((n-1) >= i) {
            i += 6 * k++;
        }

        return k;
    }
}