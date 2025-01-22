package edujava;

import java.util.ArrayList;

class Info {
    private int no;
    private String email;
    public Info(){
        super();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Info(int no, String email){
        super();
        this.no = no;
        this.email = email;
    }
    @Override
    public String toString(){
        return "Info [no=" + no + ", email=" + email + "]";
    }
}
public class Test001_model {
    public static void main(String[] args){
        ArrayList<Info> arrayList = new ArrayList<>();
        arrayList.add(new Info(1,"aaa123@gmail.com"));
        arrayList.get(arrayList.size()); //전체출력 get으로
        arrayList.set(0,new Info(1,"abcc123@gmail.com")); //set으로 수정
        arrayList.remove(1);  //remove로 제거
    }
}
