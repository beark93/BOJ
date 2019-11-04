public class baekjoon_1152 {
    public static void main(String[] args) throws Exception{
        int count=0;
        boolean start=false; // 문자열 시작유무 (문자열 앞 공백이 있을 수 있음)
        int prev = -1; // 직전 문자 (문자열 뒤 공백이 있을 수 있음)

        for(int c=System.in.read();(c!='\n'&&c!='\r');c=System.in.read()) { // 한줄을 1글자씩 받는다.
            prev = c;
            if(!start) {
                if(c!=' ') {
                    start=true; // 문자열 시작 체크
                }
            } else {
                // prev = c; // 이 코드를 8번줄이 아닌 이 곳에 작성하면 공백만 입력하였을 경우 확인이 안 된다....
                if(c == ' ') {
                    count++; // 공백문자 카운팅
                }
            }
        }

        if(prev == ' ') count--; // 마지막 문자가 공백일 경우 카운팅 감소
        System.out.println(count+1); // 공백갯수+1 == 단어갯수
    }
}