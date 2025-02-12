package implement;

import java.util.Scanner;

public class GroupWordChecker {

    static Scanner in = new Scanner(System.in); //GroupWordChecker에 종속되는 static 인스턴스 Scanner
    public static void main(String[] args) {

        int count = 0;
        int N = in.nextInt();

        for(int i = 0; i < N ; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {  //만약 여기서 static으로 선언하지않을경우 본문 main 에서 사용불가
        boolean[] check = new boolean[26];
        int prev = 0;
        String str =  in.next();

        for(int i = 0; i<str.length();i++){  //함수로 한번씩 검증하기
            int now = str.charAt(i); // i번째(0번째 인덱스)부터 시작

            //앞선 문자와 현재 문자가 같지않다면
            if(prev != now) {

                //해당문자가 처음나오는경우(다시 순회해서 검증)
                if(check[now -'a'] ==false){
                    check[now - 'a'] =true; //true로 바꾼다.
                    prev = now;
                }

                else {
                    return false; //이미 나온적이 있다면 함수 종료
                    //그륩단어가 아님. 카운트 x
                }
            }

            else {
                continue; // 앞선문자와 i번째 문자가 같다면

            }
        }
        return true;
    }
}



