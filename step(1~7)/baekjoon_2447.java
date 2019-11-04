import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_2447 {
	public static char[][] ans;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ans = new char[N][N];
        
        for(int i=0;i<N;i++) {
        	Arrays.fill(ans[i], ' ');
        }

        getStar(N);
        
        for(int i=0;i<N;i++) {
        	System.out.println(ans[i]);
        }
        
    }
    
    public static void getStar(int x, int y, int n) {
        if(n==1) {
        	ans[x][y] = '*';
        } else {
        	int m = n/3;
        	for(int i=0;i<3;i++) {
        		for(int j=0;j<3;j++) {
        			if(i==1 && j==1) {
        				continue;
        			} else {
        				getStar(x+m*i,y+m*j,n/3);
        			}
        		}
        	}
        }
    }
    
    public static void getStar(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int x=i;
                int y=j;
                
                while(x > 0) {
                    if(x % 3 == 1 && y % 3 == 1) {
                        break;
                    }

                    x /= 3;
                    y /= 3;
                }
                
                ans[i][j] = x==0 ? '*' : ' ';
            }
        }
    }
}