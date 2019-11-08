/**
 * baekjoon_1193
 */
import java.io.*;

public class baekjoon_1193 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(solution2(Integer.parseInt(br.readLine())));
    }   
    
    public static String solution(int n) {
        int x=1, y=1;
        int k =1;

        // 분모를 x , 분자를 y 라 하면 2차원 배열로 생각 할 수 있다.
        // 각 좌표를 더한 값은 유지되며 대각 이동 : 1
        // 각 좌표를 더한 값이 짝수일 경우 y좌표가 1일 때 x축으로 1칸 이동 : 2
        // 각 좌표를 더한 값이 홀수일 경우 x좌표가 1일 때 y축으로 1칸 이동 : 3
        while(k < n) {
            if((x+y)%2 == 0) {
                if(y==1) { // 2
                    x++;
                } else { // 1
                    x++;
                    y--;
                }
            } else {
                if(x==1) { // 3
                    y++;
                } else { // 1
                    x--;
                    y++;
                }
            }
            k++;
        }

        return (y + "/" + x);
    }
    
    public static String solution2(int n) {
        int v = 0, i = 0;

        // 1,3,6,10,... 의 숫자가 기준 : v
        // v의 수열의 index 값 : i
        while(v < n) {
            v += ++i;
        }

        // v는 n의 진행방향의 끝 값(대각 이동의 끝점) -> n=8(2/3) 일 경우 좌하향 방향으로 이동 중이au 그 끝값 v=10(4/1)
        // v가 짝수면 n까지 분모는 커지고 분자는 작아지며 v가 홀수일 경우는 반대
        return (i % 2 == 0) ? (i - v + n) + "/" + (1 + v - n) : (1 + v -n) + "/" + (i - v + n);
    }
}