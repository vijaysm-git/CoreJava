package PatternPrinting;

public class PatternPritintingTUF {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <  row ; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*n-(2 * row + 1); col++) {
                System.out.print("*");
            }
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int row = 0; row <= 2*n-1; row++) {
            int logic = row >=n ? 2*n-row : row;
            for (int col = 0; col < logic ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
        static void pattern12(int n){
        int start = 1;
        for (int row = 0; row < n; row++) {
                if (row % 2 == 0) start = 1;
                else start =0;
            for (int col = 0; col < row; col++) {
                System.out.print(start + " ");
                start=1-start;

            }
            System.out.println();
        }
    }


}