/*
*              Mirror image of a Matrix.
*	Input elements in a matrix.
*	Display the original matrix.
*	Swap the elements swaps of first column with last and second column with second last and so on.
*	Display mirror matrix.
*/
import java.util.*;
class mirrorMatrix
{
    void main()
    {
        int M, i, j, k, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows for a square matrix: ");
        M= scan.nextInt();
        if(M<=2 || M>=20)
        {
            System.out.println("SIZE OUT OF RANGE");
        }
        else
        {
            int A[][] = new int [M][M];
            for(i=0;i < M;i++)
            {
                for(j=0;j < M;j++)
                {           
                    System.out.println("Enter  elements ");
                    A[i][j] = scan.nextInt();
                }
            }

            //display the original matrix
            System.out.println("ORIGINAL MATRIX");
            for(i=0;i < M;i++){
                for(j=0;j < M;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

            //use two counters for accessing columns -
            // one incremental, one decremental

            for(j=0, k = M-1; j < M/2; j++, k--)
            {

                for(i=0;i < M; i++)
                {
                    //swap the elements of the first column with the last
                    //second column with second last and so on

                    t = A[i][j];
                    A[i][j] = A[i][k];
                    A[i][k] = t;

                }
            }

            //display the mirror image matrix
            System.out.println("MIRROR MATRIX");
            for(i=0;i < M;i++)  
            {
                for(j=0;j < M;j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}