package edujava;

import java.util.HashMap;
import java.util.Map;

public class Map001 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();  //해시코드를 바탕으로 하는 리스트인데 특징은 key:value 순서로 이루어져있음 like json
        map.put("one","하나");  //내부에는 헤시테이블을 이용하여 데이터를 저장
        map.put("two", "둘");
        //map.("one","셋");
        map.put("three" ,"세엣");

        System.out.println(map);
        System.out.println(map.get("one"));
        System.out.println(map.size());
        System.out.println(map.remove("three"));
        System.out.println(map.containsKey("one"));

        System.out.println();
        System.out.println();

        for(String key : map.keySet()){
            System.out.println(key + "/" + map.get(key));
        }

    }
}
