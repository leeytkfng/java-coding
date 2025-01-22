package edujava;

import java.util.HashSet;
import java.util.Set;

class Milk{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;  //캡슐화 정보은닉
    private int price;

    public Milk(){ //object 클래스의 기본생성자를 호출하기 그래야 toString 사용가능
        super();
    }
    public Milk(String name, int price){
        super();
        this.name=name;
        this.price =price;
    }
    @Override
    public String toString(){
        return "Milk [name=" + name + ", price=" +price+ "]";
    }

}

public class Setlist {
    public static void main(String[] args){
        Set<Milk> set= new HashSet<>();

        set.add(new Milk("banana",1800));
        set.add(new Milk("apple",1300));
        set.add(new Milk("coconut",1200));
        set.add(new Milk("banana",1120));

        System.out.println(set.size());
        System.out.println(set);

        for (Milk m : set){
            System.out.println(m);
        }
    }
}
