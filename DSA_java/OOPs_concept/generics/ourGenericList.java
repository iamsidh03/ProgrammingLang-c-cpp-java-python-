package generics;
import java.util.Iterator;

public class ourGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;
    public ourGenericList(){
         size=0;
        items=(T[])new Object[100];
    } 
    public void add(T item ){
        items[size++]=item;
    }
    public T getItemAtIndex(int index){
        return items[index];
   
    }
    public Iterator<T> iterator(){
        return new ourGenericListIterator(this);
    }
    private class ourGenericListIterator implements Iterator<T>{
        private ourGenericList<T> list;
        private int index=0;
        public  ourGenericListIterator(ourGenericList<T> list){
            this.list=list;
        }
            public boolean hasNext(){
                System.out.println("has Next called");
                return index<list.size;
            }
            
            public T next() {
                System.out.println("next called");
                return list.items[index++];
            }
    }
}

