package generics;
import java.util.ArrayList;
import java.util.List;
/*
 * wildcard generics ----?
 * public static void deposit(ArrayList <?> Money)---------unbounded wildcard
 * 
 * upperbound wildcard use to restrict the upper bound of parameter type 
 * Syntax----"? extends UpperBound_class"
 * 
 * lowerBound wildcard use to restricts the unknown type to special parameter type
 * Syntac----"? super LowerBound_class"
 */
public class Wildcard_generics {
    public static void deletebike(List<? extends bike> l1,bike b1){
        l1.remove(b1);
        System.out.println("Bike removed : "+b1);

    }
    public static void addBike(List<? super bullet> l2){
        l2.add(new bullet("bullet", 200, "Classic-350cc", 2500000));
        l2.add(new bullet("bullet", 200, "ShortGun-650", 3500000));
        l2.add(new bullet("bullet", 200, "Continental GT 650", 4500000));
        System.out.println("Bile added "+l2);
    }
    public static void printItem(List<?> list){
        for(Object i:list){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        List<vehicle> v1=new ArrayList<>();
        List<bike> b1=new ArrayList<>();
        addBike(b1);
        addBike(v1);
        printItem(v1);
        printItem(b1);
        

    }
}
class vehicle{
    String name;
    int speed;
    vehicle(String name,int speed){
        this.speed=speed;
        this.name=name;

    }
    public String toString(){
        return name;
    }
    public int  getSpeed() {
        return speed;
}}
class bike extends vehicle{
    
    bike(String name,int speed){
        super(name,speed);
}}
class car extends vehicle{
car(String name,int speed){
    super(name, speed);
}}
class bullet extends bike{
    String ModelName;
    float Price;
    bullet(String name,int speed,String modelName,float price){
        super(name, speed);
        this.ModelName=modelName;
        this.Price=price;

}}
