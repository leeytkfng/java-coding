package Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class charSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine(); //숫자를 문자열을 입력받음
        // 문자열을 준자 배열로 변환
        br.close();

        Character[] digits =new Character[number.length()];
        for (int i=0;i<number.length(); i++){
            digits[i] = number.charAt(i); //저장
        }
        //숫자를 하나하나 출력(비교 가능)


        //내림차순 정렬
        Arrays.sort(digits , Collections.reverseOrder());

        //정렬된 문자 배열을 문자열로 변환
        StringBuilder sb = new StringBuilder();//스트링 빌더로 내림차순으로 어펜드
        for(char digit: digits) {
            sb.append(digit);
        }
        System.out.println(sb.toString());
    }
}