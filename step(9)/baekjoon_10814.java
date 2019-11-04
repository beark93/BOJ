/**
 * baekjoon_10814
 */
import java.io.*;
import java.util.*;

public class baekjoon_10814 {

    public static class User {
    
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String toString() {
            return this.age + " " + this.name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        /*
        User[] array = new User[n];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            array[i] = new User(Integer.parseInt(st.nextToken()),st.nextToken());
        }

        // 나이순 정렬 -> 안정성이 보장된다면 같은 나이에서는 입력순서가 유지된다.
        Arrays.sort(array, new Comparator <User>(){
            
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge() - u2.getAge();
            }
        });

        for(int i=0;i<n;i++) bw.write(array[i] + "\n");
        bw.flush();
        */

        StringBuilder[] ageArr = new StringBuilder[201];
        for(int i=0;i<201;i++) ageArr[i] = new StringBuilder();

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            ageArr[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }
        for(StringBuilder sb : ageArr) bw.write(sb.toString());
        bw.flush();
    }
}