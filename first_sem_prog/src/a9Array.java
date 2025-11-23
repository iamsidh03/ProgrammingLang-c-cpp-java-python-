public class a9Array {
    public static void update(int marks[],int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i<marks.length;i++){
            marks[i]=marks[i] +2;//here we can add +1,+2,infact sub,multiply etc

        }
    }

    public static void main(String[] args) {
        int marks[] = {98,97,96};
        int nonchangable = 5;
        update(marks, nonchangable);
        System.out.println(nonchangable);
        //print our marks
        for (int i = 0; i<marks.length;i++){
            System.out.print(marks[i] + " ");

        }
        System.out.println();
    }
}
