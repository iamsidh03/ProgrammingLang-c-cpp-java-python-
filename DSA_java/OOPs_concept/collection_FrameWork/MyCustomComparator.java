package collection_FrameWork;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        return o2.getField()-o1.getField();
    }
}
