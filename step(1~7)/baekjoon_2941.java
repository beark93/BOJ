public class baekjoon_2941 {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int prev = 0;

        for(int c=System.in.read();c>='-';c=System.in.read()) {
            if(c=='='||c=='-') { // 특수문자 입력 일 경우 무조건 count X
                if(c=='=' && prev==-1) count--; // dz= 일 경우 count -1
            } else {
                if(c=='z'&&prev=='d') { // dz가 입력되었을 경우 확인(count하면서 확인만)
                    prev = -1;
                    count++;
                    continue;
                } else {
                    if(!(c=='j'&&(prev=='l'||prev=='n'))) count++; // lj or nj가 아닐경우만 count
                }
            }
            prev=c; // 이전문자 기록
        }

        System.out.println(count);
    }
}