package collection_FrameWork;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        /*
        //FIFO queue
        Queue<Integer> q= new LinkedList<>();
        q.offer(10);
        q.offer(2);
        q.offer(200);
        q.offer(25);
        q.offer(255);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

 */
        //ARRAY DEQUE
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(13);
        dq.offerFirst(31);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq.peekFirst());
        System.out.println(dq);


    }
}
