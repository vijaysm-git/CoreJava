package PatternPrinting;

public class Patterns {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalRowsInCol = row > n  ? 2*n-row:row;
            for(int col = 0; col <totalRowsInCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalRowsInCol = row >n ? 2*n-row:row;

            int noOfSpaces = n-totalRowsInCol;
            for(int s = 0 ; s <noOfSpaces; s++)
                System.out.print(" ");
            for (int col = 0; col < totalRowsInCol; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern7(int n){
        for (int row = 1; row <= n ; row++) {
            for (int s = 0; s < n-row ; s++) {
                System.out.print("  ");

            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " " );

            }
            for (int col = 2; col <= row; col++)
                System.out.print(col + " ");{

            }
            System.out.println();
        }

    }
    static void pattern8(int n){
        for (int row = 1; row <=2*n ; row++) {
            int c = row > n ? 2*n -row : row;

            for (int s = 0; s < n-c ; s++) {
                System.out.print("  ");

            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " " );

            }
            for (int col = 2; col <= c; col++)
                System.out.print(col + " ");{

            }
            System.out.println();
        }

    }
        static void pattern9(int n ){
        int OGn = n  ;
        n = 2*n;
            for (int row = 0; row <= n ; row++) {
                for (int col = 0; col <= n ; col++) {
                    int atIndex = OGn - Math.min (Math.min(row,col), Math.min(n-row,n-col));


                    if (atIndex == 0) {
                        System.out.print("  ");
                    }else{
                        System.out.print(atIndex + " ");

                        }

                    }
                System.out.println();
                }

            }
        }

