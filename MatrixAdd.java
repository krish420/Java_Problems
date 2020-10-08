import java.util.Scanner;
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row of the 1st Matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter Coloumn of the 1st Matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter Row of the 2st Matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter Coloumn of the 2st Matrix: ");
        int c2 = sc.nextInt();

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        System.out.println("Enter the value of 1st Matric: ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j<c1;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of 2nd Matric: ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j<c2;j++){
                B[i][j] = sc.nextInt();
            }
        }
        int C[][] = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The Result of Addition of two Matrices is :");
            for(int x[]: C){
                for(int y:x){
                    System.out.printf("%-3d ",y);
                }
                System.out.println("");
            }
        sc.close();
    }
}    
