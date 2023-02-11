//push the element at buttom at the stack 
import java.util.*;
public class PushFromBottomStack{
    public static void pushAtButtom(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);


    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtButtom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}