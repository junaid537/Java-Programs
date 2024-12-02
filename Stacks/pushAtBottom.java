import java.util.*;

public class pushAtBottom {
    public static void pushAtLast(Stack<Integer> s,int element){
        if(s.isEmpty()==true){
            s.push(element);
            return;
        }
        int top=s.pop();
        pushAtLast(s,element);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("----------------");
        //Insert back gain as stack is empty
        s.push(1);
        s.push(2);
        s.push(3);
        int element=4;
        pushAtLast(s,element);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
