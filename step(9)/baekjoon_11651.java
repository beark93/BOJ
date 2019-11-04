/**
 * baekjoon_11650
 */
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_11651 {
    static int[] sorted; // 병합정렬을 위한 전역변수
    static int[] sorted_sub; // 병합정렬을 위한 전역변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        sorted = new int[n];
        sorted_sub = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        StringTokenizer st;

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(x, y, 0, n-1);
        mergeSort(y, x, 0, n-1);

        for(int i=0;i<n;i++) {
            bw.write(x[i] + " " + y[i]);
            bw.newLine();
        }

        bw.flush();
    }

    // 병합정렬 병합과정
    public static void merge(int[] array, int[] sub, int m, int middle, int n) {
        int i=m, j=middle+1, k=m;

        while(i<=middle && j<=n) {
            if(array[i]<=array[j]) {
                sorted[k] = array[i];
                sorted_sub[k] = sub[i];
                i++;
            } else {
                sorted[k] = array[j];
                sorted_sub[k] = sub[j];
                j++;
            }
            k++;
        }

        if(i > middle) {
            for(int t=j;t<=n;t++) {
                sorted[k] = array[t];
                sorted_sub[k] = sub[t];
                k++;
            }
        } else {
            for(int t=i;t<=middle;t++) {
                sorted[k] = array[t];
                sorted_sub[k] = sub[t];
                k++;
            }
        }

        for(int t=m;t<=n;t++) {
            array[t] = sorted[t];
            sub[t] = sorted_sub[t];
        }
    }

    // 병합정렬 최소단위로 나누며 병합
    public static void mergeSort(int[] array, int[] sub, int m, int n) {
        if(m<n) {
            int middle = (m+n)/2;
            mergeSort(array,sub,m,middle);
            mergeSort(array,sub,middle+1,n);
            merge(array,sub,m,middle,n);
        }
        
    }
}