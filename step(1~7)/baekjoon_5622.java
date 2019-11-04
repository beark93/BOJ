public class baekjoon_5622 {
    public static void main(String[] args) throws Exception {
        int time = 0;

        for(int c=System.in.read();c>='A';c=System.in.read()) {
            if(c<'P') time+= 3+(c-'A')/3; // 2,3,4,5,6 -> 알파벳 3개씩
            else if(c<'T') time+= 8; // 7
            else if(c<'W') time+= 9; // 8
            else time+= 10; // 9
        }

        System.out.println(time);
    }
}