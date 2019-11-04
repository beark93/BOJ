/**
 * baekjoon_1181
 */
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class baekjoon_1181 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] array = new String[n];

        for(int i=0;i<n;i++) array[i] = br.readLine();

        // 기본 String 정렬 시 사전순으로 정렬된다.
        Arrays.sort(array);
        // 문자열 길이로 정렬 (안정성이 보장된다면 같은 길이에서는 사전순으로 정렬)
        Arrays.sort(array, new Comparator<String> (){

            @Override
            public int compare(String s1, String s2) {
                // Comparator 사용 시 예외값으로 0리턴을 넣어 주어야 런타임에러 발생 X
                if(s1.length()==s2.length()) return 0;
                else if(s1.length()<s2.length()) return -1;
                else return 1;
            }
        });

        // 출력 시 중복검사(정렬이 되었으므로 같은 단어는 직전에 나왔어야함)
        for(int i=0;i<n;i++) {
            if(i == 0 || !array[i-1].equals(array[i])) {
                bw.write(array[i] + "\n");
            }
        }
        bw.flush();
    }
}