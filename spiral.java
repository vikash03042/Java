import java.util.*;
public class spiral {
   public static void printspiral(int matrix[][]){
    int startRow=0;
    int startCol=0;
    int endRow=matrix.length-1;
    int endCol=matrix[0].length-1;

    while(startRow<=endRow;j<=endCol&&startCol<=endCol){
        for(int j=startCol;j<=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }

        for(int i= startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endCol]+" ");
        }

        for(int j=endCol-1;j<=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");

        }


        for(int i= endRow-1;i<=startRow+1;i--){
            if(startRow==endRow){
                break;
            }

            System.out.print(matrix[i][startcol+1]);
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
        
    }
   }

   public static void main(String[] args) {
    int matrix[][];
    System.out.println("Enter the total elements of the matrix\n");
    Scanner sc=new Scanner(System.in);
    int matrix[][]=sc.nextInt();
    System.out.println(Entered matrix is:+matrix[][]);
    printspiral(matrix);


   }
}