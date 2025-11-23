
class myemployee {
    private int id;
    private String name;

     public String getname(){
        return name;
    }
     public void setname(String name){
       // name =n;
    }
     public void setid(int i) {
        id = i;
    }
    public int getid(){
        return id;
    }

    }

    public class a17_Access_mdifier {
    public static void main(String[] args) {
    myemployee raj = new myemployee();

    raj.setname("siddharth");
        System.out.println(raj.getname());



    }
}
