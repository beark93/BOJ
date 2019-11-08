/**
 * baekjoon_2839
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class baekjoon_2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean b = false;

        int x=0;
        int y=0;
        for(int i=1;i*5<=n;i++) x=i; // 5의 최대배수 찾기

        // 5의 최대배수를 감소시키면서 N에서 뺀 수 중 3으로 나누어 떨어지는 수 찾기
        for(int i=x;i>=0;i--) {
            int m = n-i*5;
            
            if(m%3 == 0) {
                for(int j=1;j*3<=m;j++) y=j;
                x=i;
                b = true;
                break;
            }
        }

        if(b) {
            System.out.println(x+y);
        } else {
            System.out.println(-1);
        }
    }
}