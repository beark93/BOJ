import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_1157 {
    public static void main(String[] args) throws Exception {
        /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); */

        int[] alpha = new int[26]; // 알파벳 중복갯수
        int max = -1; // 최대갯수
        int index = -1; // 최대갯수의 알파벳 index값

        /* for(int c:br.readLine().getBytes()) { // 입력문자열을 1Byte씩 확인
            if(c>'Z') alpha[c-'a']++; // 소문자일경우
            else alpha[c-'A']++; // 대문자일경우
        } */

        for(int c = System.in.read();c>='A';c=System.in.read()) { // 한글자씩 입력
            if(c>'Z') alpha[c-'a']++; // 소문자일경우
            else alpha[c-'A']++; // 대문자일경우
        }

        boolean duplicate = false; // 최댓값 중복검사

        for(int i=0;i<26;i++) {
            if(alpha[i] == max) {
                duplicate = true;
            } else if(alpha[i]>max) { // 최댓값 탐색
                max = alpha[i];
                index = i;
                duplicate = false;
            }
        }

        if(duplicate) {
            System.out.println('?'); // 중복일 경우
        } else {
            System.out.println((char)(index+'A'));
        }
    }
}