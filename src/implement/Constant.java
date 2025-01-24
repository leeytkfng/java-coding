package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" "); //공백으로 문자열 입력받기
        br.close();

        int a = Integer.parseInt(new StringBuilder().append(arr[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(arr[1]).reverse().toString());

        System.out.println(a>b?a:b);

    }
}
