/**
 * baekjoon_1011
 */
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_1011 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] test = new int[n];
        StringTokenizer st;

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            test[i] = (Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken())) * -1;
        }

        for(int i=0;i<n;i++) System.out.println(solution(test[i]));
    }

    public static int solution(int d) {
        if(d < 3) return 1;

        // 작동횟수별 최대 이동거리를 구하면 1, 1+1, 1+2+1, 1+2+2+1, 1+2+3+2+1, ...
        // 작동회수가 짝수일 경우 n번 이동 시 최대이동리는 n(n+1)
        // 홀수일 경우 n(n+2)+1
        // 각각 근의 공식 적용 후 작은 값 출력
        int x = (int)Math.ceil((-1 + Math.sqrt(1 + 4 * (double)d)) / 2);
        int y = (int)Math.ceil(-1 + Math.sqrt((double)d));

        return (2*x < 2*y+1) ? 2*x : 2*y+1;
    }
}