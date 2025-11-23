import javax.crypto.spec.PSource;

class employee{
    int id;
    String name;
    public void printDetail(){
        System.out.println("My id is "+ id);
        System.out.println("my name is "+ name);
    }

}
public class a16_OOPs {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee raj = new employee();
        raj.id = 15;
        raj.name = "siddharth";
        //System.out.println(raj.id);
      //  System.out.println(raj.name);
        raj.printDetail();


    }
}
