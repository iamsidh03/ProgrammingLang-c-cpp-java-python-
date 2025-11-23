package collection_FrameWork;
import java.util.*;

    
public class PriorityQueueImplementation {
    public static void main(String[] args) {
        /*
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        List<Integer> top2=new ArrayList<>();
        int index=0;
        while(!pq.isEmpty()){
            if(index==2){
                break; 
            }
            top2.add(pq.poll());
            index++;
        }
        System.out.println(top2);
        System.out.println(pq);
         */

        //what if  we want to add elements in priority queue?
        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(50,100));
        stMarks.add(new StudentMarks(70,50));
        stMarks.add(new StudentMarks(40,60));
        stMarks.add(new StudentMarks(10,80));
        stMarks.add(new StudentMarks(35,70));
        PriorityQueue<StudentMarks> marksPQ = new PriorityQueue<>(stMarks);
        List<StudentMarks> top3=new ArrayList<>();
         int index=0;
        while(!marksPQ.isEmpty()){
            if(index==3)
            break;

            top3.add(marksPQ.poll());
            index++ ;
        }
        System.out.println(top3);


    }
}
