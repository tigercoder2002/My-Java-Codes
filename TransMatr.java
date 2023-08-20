// Transpose of Matrix.
import java.util.*;
class TransMatr{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter Matrix Dimension, seperated by spaces: ");
        int r=inp.nextInt(), c=inp.nextInt();
        int ord=(r>=c)?r:c;
        int mat[][]=new int[ord][ord];
        System.out.println("Enter the Matrix Elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=inp.nextInt();
        for(int i=0;i<ord;i++)
            for(int j=i;j<ord;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<c;i++){
            System.out.print("|\t");
            for(int j=0;j<r;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println("|");
        }
    }
}