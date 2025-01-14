package greedy;

import java.io.*;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Camping {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선

        StringTokenizer st;
        int L = 0;
        int P = 0;
        int V = 0;
        int i = 0;
        while (true){
            int answer;
            i++;
            st = new StringTokenizer(br.readLine()); //기본적으로 공백을 구분하여 단어를 나움
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            if (V == 0){
                break;  //휴가일수가 0일때는 종료구문
            }
            if(V%P>L){
                answer = V/P*L + L; //만약 사용가능날자가 나머지값보다 작으면 그 일수만큼 또 못하기때문에 L 을더함
            } else {
                answer = V/P*L + V%P;
            }
            bw.write("Case "+i+": "+answer+"\n");
        }
        bw.close();
        br.close();

    }
}
