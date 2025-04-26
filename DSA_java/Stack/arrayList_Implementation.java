package Stack;

import java.util.ArrayList;

 class arrayList_Implementation {
    static class Stack{
         static ArrayList<Integer> list =new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
                list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        /*
        you can also create objects 
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while(!stack.isEmpty()){
        System.out.println("Top element is "+stack.peek());
        stack.pop();
         */
        //but Since we make static so need to make objects
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        while (!Stack.isEmpty()) {
            System.out.println("Top element is "+Stack.peek());
                Stack.pop();

        }
        

    }
     
        

        
    }

