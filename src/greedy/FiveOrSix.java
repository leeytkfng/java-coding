package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.StringTokenizer;

public class FiveOrSix {
    public static void main(String[] args) throws IOException , ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 두 개의 숫자 입력
        String a = st.nextToken();
        String b = st.nextToken();

        a = a.replace('6','5');
        b = b.replace('6','5'); //최소가될수밖에 없음

        int min = Integer.parseInt(a) + Integer.parseInt(b);

        a = a.replace('5','6');
        b = b.replace('5','6'); //최대가될수밖에 없음

        int max = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.println(min + " " + max);
        br.close();




    }
}

