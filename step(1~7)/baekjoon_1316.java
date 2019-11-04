import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 테스트 갯수
        int count = 0; // 그룹 단어 카운팅

        for(int i=0;i<n;i++) {
            int[] alpha = new int[26]; // 알파벳 사용횟수
            boolean isGroup = false; // 그룹 단어 확인
            int prev = 0; // 직전 단어

            for(int c:br.readLine().getBytes()) {
                if(prev!=c && alpha[c-'a']>0) { // 다른 알파벳이 들어왔을 때 이전에 들어온 적이 있는지 확인
                    isGroup = false;
                    break;
                }
                isGroup = true;
                prev=c;
                alpha[c-'a']++;
            }

            if(isGroup) count++; // 그룹 단어일 경우 카운팅
        }

        System.out.println(count);
    }
}