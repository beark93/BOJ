import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine()); // 테스트 개수

        for(int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 반복횟수와 문자열을 공백을 기준으로 분리하기 위한 StringTokenizer 객체 생성

            int n = Integer.parseInt(st.nextToken()); // 반복횟수
            
            for(byte c:st.nextToken().getBytes()) { // 입력 문자열을 1Byte씩 읽는다.(1글자)
                for(int j=0;j<n;j++) {
                    bw.write(c); // 1글자를 반복횟수만큼 버퍼에 입력
                }
            }
            bw.newLine(); // 테스트 케이스별 줄바꿈
        }
        bw.flush(); // 출력
        
    }
}