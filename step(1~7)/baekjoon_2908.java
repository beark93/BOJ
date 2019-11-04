public class baekjoon_2908 {
    public static void main(String[] args) throws Exception {
        int[] sangsu = new int[2]; // 상수가 보는 숫자
        int a = 0; // 자릿수
        int index = 0;

        for(int c=System.in.read();c>=' ';c=System.in.read()) { // 한글자씩 입력받는다.
            if(c != ' ') {
                sangsu[index] += (c-'0')*(int)Math.pow(10,a); // 높은 자리수부터 낮은자리수로 변환해서 더하기
                a++;
            } else { // 첫번째 수 입력 끝났을 때
                a=0;
                index++;
            }
        }

        System.out.println((sangsu[0]>sangsu[1])?sangsu[0]:sangsu[1]); // 큰 숫자 출력
    }
}