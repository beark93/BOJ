/**
 * baekjoon_2750
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_2750 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];

        for(int i=0;i<n;i++) array[i] = Integer.parseInt(br.readLine());

        quickSort(array,0,n-1);

        for(int i=0;i<n;i++) System.out.println(array[i]);
    }

    public static void selectionSort(int[] array) {
        int temp=0;

        for(int i=0;i<array.length;i++) {
            int min=9999, index=0;
            for(int j=i;j<array.length;j++) {
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void BubbleSort(int[] array) {
        int temp=0;

        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int temp=0;

        for(int i=1;i<array.length;i++) {
            for(int j=i;j>0;j--) {
                if(array[j] < array[j-1]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if(start >= end) return;
        int key = start, i=start+1, j=end, temp;

        while(i<=j) {
            while(i <= end && array[i]<=array[key]) i++;
            while(j > start && array[j]>=array[key]) j--;

            if(i>j) {
                temp = array[j];
                array[j] = array[key];
                array[key] = temp;
            } else {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        quickSort(array, start, j-1);
        quickSort(array, j+1, end);
    }
}