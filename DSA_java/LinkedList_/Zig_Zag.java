package LinkedList_;
import java.util.*;
 class node{
  int data;
  node next;
}
 class Zig_Zag {
    public  node head;
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
      //  ll.head=new node();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
       ll.print();
      // ll.zigZag(ll.head);


    }
   
    private node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

    }
    return slow;
    }
        private node reverse(node head){
             node current=head.next;
             head.next=null; 
                node prev=null;
                
                node next;
                while(current!=null){
                    next=current.next;
                    current.next=prev;
                    prev=current;
                    current=next;
        }
        head=prev;
        return prev;
}  
   void Zig_ZagList(){
    node mid=getmid(head);
    node rev= reverse(mid);
    node leftHead=head;
    node rightHead=rev;
    node nextleft,nextright;
    while(leftHead!=null&&rightHead!=null){
        nextleft=leftHead.next;
        leftHead.next=rightHead;
        nextright=rightHead.next;
        rightHead.next=nextleft;

        rightHead=nextright;
        leftHead=nextleft;
    }
   
   }

}

    

