/**
 * baekjoon_2751
 */
import java.io.*;

public class baekjoon_2751 {
    static int[] sorted; // 병합정렬을 위한 전역변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        for(int i=0;i<n;i++) array[i] = Integer.parseInt(br.readLine());

        // sorted = new int[n];
        // mergeSort(array,0,n-1);
        // heapSort(array);

        // for(int i=0;i<n;i++) {
        //     bw.write(String.valueOf(array[i]));
        //     bw.newLine();
        // }

        int[] count = countingSort(array, 2000001);
        for(int i=0;i<2000001;i++) {
            if(count[i] != 0) {
                bw.write(String.valueOf(i - 1000000));
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static int[] countingSort(int[] array, int range) {
        int[] count = new int[range];

        for(int i=0;i<array.length;i++) {
            count[array[i] + 1000000]++;
        }

        return count;
    }

    // 병합정렬 병합과정
    public static void merge(int[] array, int m, int middle, int n) {
        int i=m, j=middle+1, k=m;

        while(i<=middle && j<=n) {
            if(array[i]<=array[j]) {
                sorted[k] = array[i];
                i++;
            } else {
                sorted[k] = array[j];
                j++;
            }
            k++;
        }

        if(i > middle) {
            for(int t=j;t<=n;t++) {
                sorted[k] = array[t];
                k++;
            }
        } else {
            for(int t=i;t<=middle;t++) {
                sorted[k] = array[t];
                k++;
            }
        }

        for(int t=m;t<=n;t++) {
            array[t] = sorted[t];
        }
    }

    // 병합정렬 최소단위로 나누며 병합
    public static void mergeSort(int[] array, int m, int n) {
        if(m<n) {
            int middle = (m+n)/2;
            mergeSort(array,m,middle);
            mergeSort(array,middle+1,n);
            merge(array,m,middle,n);
        }
        
    }

    // 해당 노드에서 하향식 최대힙
    public static void maxHeapify(int[] array, int i, int size) {
        int left = 2*i+1, right = 2*i+2;
        int large = i;

        if(left < size && array[left] > array[large]) large = left;
        if(right < size && array[right] > array[large]) large = right;
        
        if(large != i) {
            int temp = array[i];
            array[i] = array[large];
            array[large] = temp;

            if(large*2+1 < size) maxHeapify(array, large, size);
        }
    }

    // 전체 트리 최대힙
    public static void maxHeap(int[] array, int size) {
        for(int i=size/2-1;i>=0;i--) {
            maxHeapify(array, i, size);
        }
    }

    // 힙정렬
    public static void heapSort(int[] array) {
        maxHeap(array, array.length); // 최초 전체 트리를 최대힙 수행

        // root와 끝값 변경
        int temp = array[array.length-1];
        array[array.length-1] = array[0];
        array[0] = temp;

        // 루트값을 제외한 모든 노드는 최대힙정렬 상태이므로 루트값에 대해서만 최대힙 진행
        for(int i=array.length-1;i>0;i--) {
            maxHeapify(array,0,i);
            temp = array[i-1];
            array[i-1] = array[0];
            array[0] = temp;
        }
    }
}