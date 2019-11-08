/**
 * baekjoon_6064
 */
import java.io.*;
import java.util.*;

public class baekjoon_6064 {

    public static void main(String[] args) {
        
    }

    public static int solution(int M, int N, int x, int y) {
        int max = (M>=N) ? M : N;
        int gcd = x;
        int y_copy = y;

        while(y>0) {
            int temp = y_copy;
            y_copy = gcd % y_copy;
            gcd  = temp;
        }

        int lcm = x * y / gcd;

        for(int i=0;i*M+x <=)
    }
}