public class new13 {public int sanji(int num ){
    int total =1;
    for (int i =2;i<=num;i++){
        if (num%i==0){
            total+=i;
        }
    }
    return total;
}
public boolean robin(int num){
    return sanji(num)>num;
}

    public static void main(String[] args) {
        System.out.println(new new13().robin(56));
    }
}
