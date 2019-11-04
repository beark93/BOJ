import java.io.*;

public class baekjoon_11729 {
	public static int cnt=0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		hanoi(1,3,N);
		
		System.out.println(cnt);
		System.out.println(sb);
	}
	
	public static void hanoi(int x, int y, int n) {
		if(n==1) {
			sb.append(x);
			sb.append(' ');
			sb.append(y);
			sb.append('\n');
			cnt++;
		} else {
			int z = 6-(x+y);
			
			hanoi(x,z,n-1);
			hanoi(x,y,1);
			hanoi(z,y,n-1);
		}
	}

}
