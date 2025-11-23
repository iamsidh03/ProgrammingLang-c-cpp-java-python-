public class a19_operators {
    public static void main(String[]args){
        int x,y,z;
        x=y=z=2;
        //x+=y;
       //y-=z; y=z-y;
        //z=(y+2)/z;
        z /= (x+y);

        System.out.println(z);



    }
}
