import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_11720{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        byte[] arr = br.readLine().getBytes();

        for(int i=0;i<N;i++) {
            sum += arr[i]-48;
        }

        System.out.println(sum);
    }
}