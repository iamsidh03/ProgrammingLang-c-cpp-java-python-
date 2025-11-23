package collection_FrameWork;
import java.util.*;
public class list {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(30);
        ListIterator<Integer> li =ll.listIterator();
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());

        //next----return item[index++];
        //prev----return item[--index];
    }
}
