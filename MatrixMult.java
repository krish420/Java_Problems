import java.util.Scanner;

public class MatrixMult {
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

        if(c1 == r2){

            int A[][] = new int[r1][c1];
            int B[][] = new int[r2][c2];

            for(int i = 0; i < r1; i++){
                for(int j = 0; j<c1;j++){
                    A[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < r2; i++){
                for(int j = 0; j<c2;j++){
                    B[i][j] = sc.nextInt();
                }
            }
            
            int C[][] = new int[r1][c2];
            for(int i = 0;i<r1;i++){
                for(int j = 0;j < c2;j++){
                    C[i][j] = 0;
                    for(int k = 0;k <=c2 ;k++){
                        
                        C[i][j] = C[i][j]+A[i][k]*B[k][j];
                    }
                }
            }
            System.out.println("The Result of Multiplicaton of two Matrices is :");
            for(int x[]: C){
                for(int y:x){
                    System.out.printf("%-3d ",y);
                }
                System.out.println("");
            }
        }
        sc.close();

    }
    
}
