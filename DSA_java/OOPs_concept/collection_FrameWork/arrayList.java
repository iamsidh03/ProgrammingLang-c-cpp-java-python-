package collection_FrameWork;
import java.util.*;
import java.util.ArrayList;
/**
 * ArrayList
 */
public class arrayList {

    public static void main(String[] args) {
      /*  
    List<Integer> l=new ArrayList();
    l.add(4);
    l.add(12);
    l.add(133);
    System.out.println(l);
    l.add(69);
    l.add(1353);
    System.out.println(l);
     */
        /*
     List<Integer> l2=new ArrayList<>(l);//this  will create a new list and add all elements of l  into it
     l2.add(2334);
     System.out.println(l);
     System.out.println(l2);
     l2.addAll(l);
     System.out.println(l.lastIndexOf(3));
     List<Integer> l3=l2.subList(1,4);
     l2.set(0,10000);
     System.out.println(l3);
      */
    /* 
    l.remove(1);// remove element at index 1st
    System.out.println(l);
    */
    /* 
    l.remove(Integer.valueOf(133));// remove value of element at any index
    System.out.println(l);
    */
    /* 
    l.clear();//delete list
    System.out.println(l);
    */



    /* 
    l.set(1, 100000);
    for (int index = 0; index < l.size(); index++) {
        System.out.println("the element is "+l.get(index));
    }
    for(Integer e:l){
        System.out.println("for each loop " +e);
    }
    Iterator<Integer> i=l.iterator();
    while (i.hasNext()) {
        System.out.println("Iterator method "+i.next());
    }
    */
    List<Integer> alist =new ArrayList<>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    alist.add(3);
    alist.add(2);
    Integer [] arr=alist.toArray(new Integer[0]);
    for(int x:arr)
    System.out.print(x+",");

    }
    
}
