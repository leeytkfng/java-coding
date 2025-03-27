import java.util.Scanner;

public class Main {

    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        stack = new int[N];

        for(int i =0;i<N;i++){
            String str = sc.next();

            switch(str) {
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    } //삽입 스택특징

    public static int pop() { //스택에서 빼는구조
        if(size ==0) {
            return -1; //아직 스택 구현 x
        } else {
            int res = stack[size -1];
            stack[size -1] =0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size; //사이즈 = 크기 반환
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if(size == 0){
            return -1;
        } else {
            return stack[size-1]; //끝번 가져오기
        }
    }
}
