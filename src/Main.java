import java.util.*;

public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String str = sc.next();
           int cnt0 = 0;
           int cnt1 = 0;

           char prev = str.charAt(0); // 첫번째문자로 초기화

           if(prev == '0') cnt0++;
           else cnt1++;

           for(int i = 1; i<str.length();i++){
               if(str.charAt(i) != prev){
                   if(str.charAt(i) == '0')cnt0++;
                   else cnt1++;
                   prev = str.charAt(i);
               }
           }
           System.out.println(Math.min(cnt0,cnt1));
    }
}


