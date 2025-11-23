package Array_1D;
import java.util.Scanner;
public class Array_1 {

        public static void display(int[]A) {
            System.out.println("Element of Array are ");
            for(int i =0;i<A.length;i++) {
                System.out.println(A[i]);
            }
        }
        public static void sumAvg(int []A) {
            int sum =0;
            double avg =0;
            System.out.println("Element of array are");
            for(int i =0;i<A.length;i++)
                sum+=A[i];
            avg=sum/(double)A.length;
            System.out.println(" Sum = "+sum);
            System.out.println("Average = "+ avg);

        }
        public static int Lsearch(int A[], int item) {
            int pos =-1;
            for(int i=0;i<A.length;i++) {
                if(A[i]==item) {
                    pos =i+1;
                    return pos;
                }
            }
            return pos;

        }
        public static void Smallest(int []A) {
            int min =A[0];
            for(int i =0;i<A.length;i++) {
                if(min>A[i]) {
                    min=A[i];
                }


            }
            System.out.println("Smallest element "+min);
        }
        public static void Largest(int []A) {
            int max =A[0];
            for(int i =0;i<A.length;i++) {
                if(max<A[i]) {
                    max=A[i];
                }


            }
            System.out.println("Largest element "+max);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of element ");
            int n =sc.nextInt();
            int[]A=new int[n];
            for(int i=0;i<n;i++) {
                System.out.println("Enter element");
                A[i]=sc.nextInt();
            }
            int ch;
            do {
                System.out.println("0. Exit ");

                System.out.println("1. Display");
                System.out.println("2. Sum and Average");
                System.out.println("3. Linear Search");
                System.out.println("4. Smallest ");
                System.out.println("5. Largest ");
                System.out.println(" Enter the choice ");
                ch=sc.nextInt();
                switch(ch) {
                    case 1:
                        display(A);
                        break;
                    case 0:
                        System.out.println(" program over ");
                        break;
                    case 2:
                        sumAvg(A);
                        break;
                    case 3:
                        System.out.println("enter element to search ");
                        int ele = sc.nextInt();
                        int pos = Lsearch(A,ele);
                        if (pos==-1) {
                            System.out.println(" Element is not present in the Array ");
                        }
                        else {
                            System.out.println("position of "+ele +" is "+pos);
                        }
                        break;
                    case 4:
                        Smallest(A);

                        break;
                    case 5:
                        Largest(A);
                        break;

                    default:
                        System.out.println("Wrong input");
                }
            }while(ch!=0);

        }

    }


