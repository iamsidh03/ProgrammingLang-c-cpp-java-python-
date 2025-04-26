package Stack;

 class LinkedList_Implementation {
    static class node{
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
    }
}
    static class Stack{
            static node head=null;
            public static boolean isEmpty(){
                return head==null;
            }
            public static void push(int data){
                node newnode = new node(data);
                if(isEmpty()){
                    head=newnode;
                    return;
                }
                newnode.next=head;
                head=newnode;

            }
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top=head.data;
                head=head.next;
                return top;
            }
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;

            }
   }
    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }

}
