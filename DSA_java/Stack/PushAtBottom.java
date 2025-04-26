package Stack;
 import java.util.*;
    class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(20);
        s.push(3);
        pushAtbottom(s, 4);
        System.out.println(s);

    }
     public static void pushAtbottom(Stack<Integer> s, int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtbottom(s, data);
            s.push(top);


    }
}
