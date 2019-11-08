import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_10809{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int index = 0;
        for(int i=0;i<26;i++) arr[i] = -1;
        
        for(int c:br.readLine().getBytes()){
            if(arr[c-97] == -1) arr[c-97] = index;
            index++;
        }

        for(int i=0;i<26;i++) System.out.print(arr[i] + " ");
    }
}