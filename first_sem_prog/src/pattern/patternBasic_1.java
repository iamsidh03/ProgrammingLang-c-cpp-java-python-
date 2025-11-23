package pattern;
/*

1.  *****
    *****
    *****
    *****
    *****


2.  *
    **
    ***
    ****
    *****


3.  *****
    ****
    ***
    **
    *


4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *


6.       *
        **
       ***
      ****
     *****


7.   *****
      ****
       ***
        **
         *


8.      *
       ***
      *****
     *******
    *********


9.  *********
     *******
      *****
       ***
        *


10.      *
        * *
       * * *
      * * * *
     * * * * *


11.  * * * * *
      * * * *
       * * *
        * *
         *


12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


13.      *
        * *
       *   *
      *     *
     *********


14.  *********
      *     *
       *   *
        * *
         *


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *


16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


17.      1
        212
       32123
      4321234
       32123
        212
         1


18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


20.    ****
       *  *
       *  *
       *  *
       ****

21.    1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15

22.    1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

23.        *      *
         *   *  *   *
       *      *      *

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

25.       *****
         *   *
        *   *
       *   *
      *****

26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

29.
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


31.      4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4

32.    E
       D E
       C D E
       B C D E
       A B C D E

33.    a
       B c
       D e F
       g H i J
       k L m N o

34.    E D C B A
       D C B A
       C B A
       B A
       A

35.    1      1
       12    21
       123  321
       12344321
 */

public class patternBasic_1 {
    public static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern1(int n) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Pattern3(int n) {
        /*

         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void PatternM2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <= n - i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern5(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n) {
        /*

         *
         **
         ***
         ****
         *****
         */
        for (int row = 1; row <= n; row++) {
            int totalSpace = n - row;
            for (int s = 0; s < totalSpace; s++) {
                System.out.print("$ ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n) {
        /*

         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void PatternM2_7(int n) {
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= n; i++) {
            int space = 0;
            for (space = 0; space <= n - i; space++) {
                System.out.print("*");

            }


            System.out.println();
        }

    }

    public static void Pattern10(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= i; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void Pattern11(int n) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            for (int col = n; col >= i; col--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    public static void Pattern28(int n) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row = 0; row <= 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            int noofSpaces = n - totalColInRow;
            for (int s = 0; s < noofSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern21(int n) {
        /*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
         */
        int j = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(j++ + " ");
            }
            System.out.println();
        }


    }

    public static void Pattern26(int n) {
        /*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void p(int n){
        int k=1;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p3(int n){

        for (int i =1;i<=n;i++){
            char ch ='A';
            for (int j =1;j<=i;j++)
            {

                System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }
    public static void p4(int n){
        /*
        $ $ $ $ $
        $ $ $ $
        $ $ $
        $ $
        $
         */

        for (int i =1;i<=n;i++){
            for (int j =n;j>=i;j--){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    public static void p5(int n ){
        /*
          1
        2 2
      3 3 3
    4 4 4 4
  5 5 5 5 5
         */
        for (int row=1;row<=n;row++){
            for (int space =1;space<=n-row;space++){
                System.out.print("%");
            }
            for (int col =1;col<=row;col++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void p6(int n ){
        /*

        5 4 3 2 *
        5 4 3 * 1
        5 4 * 2 1
        5 * 3 2 1
        * 4 3 2 1
         */
        for (int i =1;i<=n;i++){
            for (int k=n;k>=1;k--){
                if (k==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(k);
                }

            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int n)
    {
        int i =0;
        for ( i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }

    public static void main(String[] args) {

        //Pattern1(5);
       // p6(5);
        pyramidPattern(5);
    }
}
