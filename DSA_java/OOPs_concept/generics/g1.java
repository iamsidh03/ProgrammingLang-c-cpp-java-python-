package generics;
class BankAccount<T>{
    T t1;
    BankAccount(T t1){
        this.t1=t1;
    }
    public void display(){
        System.out.println(t1);
    }
    public  <T> void deposit(T[] amt){
        for(T e1:amt){
            System.out.print(e1+"  ");
        }
    }
}
public class g1 {
    public static void main(String[] args) {
        //Integer[] m1={100,300,3403};
         BankAccount<Integer> b1=new BankAccount<>(34);
         BankAccount<String> b2=new BankAccount<>("Raj");
        //  b1.display();
        //  b2.display();
         Integer[] m1={20,493,43546,57,68768};
         Double[] m2={34.434,545.545,454.5};
         b2.deposit(m1);
         b2.deposit(m2);
        
    }
}
