package collection_FrameWork;
import java.util.*;
public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(20);
        stack.push(200);
        stack.push(455);
        stack.push(80);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        
    }
    }
    

