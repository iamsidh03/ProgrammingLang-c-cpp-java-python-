package LinkedList_;
 
  public class LinkedList{

    public static void main(String[] args) {
        LinkedList createList =new LinkedList();
        createList.addFirst(10);
        createList.addFirst(20);
        createList.addFirst(30);
        createList.addFirst(40);
        createList.addlast(300);
       createList.add(200,3);
       createList.print();
       //System.out.println("Size of linked list:"+size);

      // System.out.println("Delete from last index "+createList.removelast());

      // System.out.println("Deleted List is:"+createList.removeFirst());

     //  createList.print();

       //System.out.println("Size of linked list:"+size);

         // int SearchElement=10;
       /*
       if(createList.LinearSearch(SearchElement)==-1){
        System.out.println("element not found");
       }
       else{
        System.out.println("Element found at index "+createList.LinearSearch(SearchElement));
       }
         */
        
       //createList.reverse();

       //createList.deleteNthfromend(3);

      // createList.print();

      // System.out.println(createList.checkPalindrome());;

        // System.out.println("Cycle Exists:"+createList.iscyle());

      //createList.removeCycle();

       //createList.head=createList.mergeSort(createList.head);

                 createList.ZigZag();
                 
            createList.print();


    }
    public static class  node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        } 
    }
        public static node head;
        public static node tail;
        public static int size;

        /*.....................,,,,,,,,,,,,,,Add First,,,,,,,,,,,,,,,,,,,,........................ */
    public void addFirst(int data){
        /*
         * step1:-  create new node
         * step2:-  assign newnode ka next to head
         * step2:-  update head =newnode
         */
        node newNode= new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
            newNode.next=head;
            head=newNode;

    }
    /*...................................Add Last............................................. */
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(tail==null){
            head=tail=newnode;
            return;
        }
        
       tail.next=newnode;
       tail=newnode;

    }
    /*.....................,,,,,,,,,,,,,,,,,Print,,,,,,,,,,,,,,,,,,.................................. */
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    /*........................,,,,,,,,,,,,,,,Add at any Index,,,,,,,,,,,,,,,,,,,,................................ */
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;

        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        
        newnode.next=temp.next;
        temp.next=newnode;
    }
    /*.................,,,,,,,,,,,,,,,,,,,Remove First,,,,,,,,,,,,,,,,,,.......................... */
    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if( size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
    /*...............................,,,,,,,,,,Remove Last,,,,,,,,,,,,,,,,,,.......................... */
    public int removelast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value=head.data;
            size=0;
            return value;
        }
        node temp=head;
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;
        }
        int value=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return value;
    }
    /*..................,,,,,,,,,,,,,,,,,,Search in a Linked List(Iterative Approach),,,,,,,,,,,,,,,,,,................. */
    public int LinearSearch(int target){
        node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==target){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    // public int recursiveSearch(int target){
    //     if(head==null){
    //         return -1;
    //     }
    //     if(head.data==target){
    //         int value=head.data;
    //         return value;
    //     }
        
    // } 
/*.................,,,,,,,,,,,,,,,,,,Reverse a Linked List,,,,,,,,,,,,,,,,,,,,,,,.......................... */
    public void reverse(){
        node prev=null;
       node  current =tail=head; // here value of head assign to tail and then value of tail assign to current
        // if you write current= head=tail it's wrong 
        // In java value is always assign right to left 
        
        node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

    }

    /* ....................,,,,,,,,,delete nth node from end,,,,,,,,,,,,,,,,,.......................... */
    public void deleteNthfromend(int n){
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next; 
            return;
        }
        int i=1;
        int iToFind=sz-n;
        node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    } 
    /*........................,,,,,,,,,,,,,,,,,,,,IsCycle,,,,,,,,,,,,,,,,,,,,,,,,........................... */
    public  boolean iscyle(){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
           
        }
        return false;
    }

    /*.............,,,,,,,,,,,,,,,,,,,,,, Find Mid Node in the Linked List,,,,,,,,,,,,,,,,,...................... */
    public node findMin(node head){
        node slow=head;
        node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=head.next; //+!
            fast=fast.next.next; //+2
        }
        return slow; 

    }  
    //..................,,,,,,,,,,,,,,,,Determine if the ll is palindrome or not,,,,,,,,,,,,,,,,,,,,,,,,,,................

    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        node midnode=findMin(head);
        node prev=null;
        node current=midnode;
        node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;


        }
        node right=prev;
        node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    } 
/*................remove cyle ................................... */
// Slow Fast approach
    public void removeCycle(){
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                System.out.println("Cycle Remove Successfully");
                break;
            }
    }
    if(cycle==false){
        System.out.println("Cycle Not Exist");
        return;
    }
    slow =head;
    node prev=null;
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
    prev.next=null;
   
    
     
}
/*>>>>>>>>>>>>>>>>>>>>>>>>> Private mid Method for  merge sort>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
private node GetMid(node head){
    node slow=head;
    node fast=head.next;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
}
return slow;
}
/*>>>>>>>>>>>>>>>>>>>>>>>>>>>> Private Merge Method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
private node Merge(node head1,node head2){
        node mergedLL=new node(-1);
        node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
               head1= head1.next;
               temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
}
while(head2!=null){
    temp.next=head2;
    head2=head2.next;
    temp=temp.next;
}
return mergedLL.next;
}
/*>>>>>>>>>>>>>>>>>>>>>>>>>>>> merge sort.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
public node mergeSort(node head){
    if(head==null||head.next==null){
        return head;

}
node mid=GetMid(head);
node righthead=mid.next;
mid.next=null;
 node newLeft=mergeSort(head);
node newRight=mergeSort(righthead);
    
    return Merge(newLeft,newRight);
}
        public void ZigZag(){
            node slow=head;
            node fast=head.next;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            node mid =slow;
            node curr=mid.next;
            mid.next=null;
            node prev=null;
            node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                
            }
            node left=head;
            node right=prev;
            node nextl,nextr;
            while(left!=null&&right!=null){
                nextl=left.next;
                left.next=right;
                nextr=right.next;
                right.next=nextl;

                left=nextl;
                right=nextr;
            }
        }
  }
