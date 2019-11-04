/**
 * baekjoon_1427
 */
import java.io.*;
import java.util.Arrays;

public class baekjoon_1427 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        char[] num_array = num.toCharArray();

        // Arrays.sort(num_array);

        // for(int i=num_array.length-1;i>=0;i--) bw.write(num_array[i]);
        // bw.flush();

        int[] count = new int[10];
        for(char c : num_array) count[c - '0']++;

        for(int i=9;i>=0;i--) {
            if(count[i] != 0) {
                for(int j=0;j<count[i];j++) {
                    bw.write(i + '0');
                }
            } 
        }
        bw.flush();
    }
}