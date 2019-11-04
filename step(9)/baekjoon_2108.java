/**
 * baekjoon_2108
 */
import java.io.*;

public class baekjoon_2108 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for(int i=0;i<n;i++) array[i] = Integer.parseInt(br.readLine());

        int[] count = new int[8001]; // 개수정렬을 위한 카운팅배열
        double sum = 0; // 평균을 위한 합계
        int max = 0; // 최댓값
        boolean max_overlap = false; // 최대값 중복검사
        int mode = 0; // 최빈값
        int index = 0; // 개수정렬 시 index

        // 카운팅을 하면서 합계를 같이 구함
        for(int i=0;i<array.length;i++) {
            count[array[i]+4000]++;
            sum += array[i];
        }

        for(int i=0;i<8001;i++) {
            // 최대값 구하기
            if(max < count[i]) {
                // 새로운 최대값이 발견되면 중복을 다시 false로
                max_overlap = false;
                max = count[i];
                mode = i - 4000;
            } else if (max == count[i]) {
                // 최대값 중복 최초 발견 시 그 값이 최빈값(2번째 작은 수)
                if(!max_overlap) {
                    max_overlap = true;
                    mode = i - 4000;
                }
            }

            // 개수정렬
            if(count[i] != 0) {
                for(int j=0;j<count[i];j++) {
                    array[index++] = i-4000;
                }
            }
        }

        int mean = (int)Math.round(sum/n);
        int middle = array[n/2];
        int range = array[n-1] - array[0];

        System.out.println(mean);
        System.out.println(middle);
        System.out.println(mode);
        System.out.println(range);

    }
}