import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> str = new ArrayList<>();

        for(int i=0; i< 5; i++){
            str.add(sc.nextLine());
        }
        int maxLength = 0 ;
        for(String s : str) {
            if(s.length() > maxLength){
                maxLength = s.length();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int k = 0;  k < maxLength; k++){
            for(int j = 0; j<str.size(); j++){
                if(k <str.get(j).length()) {
                    sb.append(str.get(j).charAt(k));
                }
            }

        }
        System.out.println(sb.toString());

        sc.close();
    }
}