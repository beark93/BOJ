/**
 * baekjoon_10989
 */
import java.io.*;

public class baekjoon_10989 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for(int i=0;i<n;i++) array[i] = Integer.parseInt(br.readLine());

        int[] count = countingSort(array, 10000);

        for(int i=0;i<10000;i++) {
            if(count[i] != 0) {
                for(int j=0;j<count[i];j++) {
                    bw.write(Integer.toString(i+1));
                    bw.newLine();
                }
            }
        }

        bw.flush();
    }

    public static int[] countingSort(int[] array, int range) {
        int[] count = new int[range];

        for(int i=0;i<array.length;i++) {
            count[array[i]-1]++;
        }

        return count;
    }
}