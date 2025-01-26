package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();


        if(str.isEmpty()){
            System.out.println(0);
        } else {
            String[] words = str.split("\\s+");
            System.out.println(words.length);
        }

    }
}
