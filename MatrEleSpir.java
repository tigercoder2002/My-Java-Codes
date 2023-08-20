// Matrix Elements in Spiral Order.
import java.util.*;
class MatrEleSpir{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter Matrix Dimension, seperated by spaces: ");
        int row=inp.nextInt(), col=inp.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("Enter the Matrix Elements:");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                mat[i][j]=inp.nextInt();
        System.out.print("Matrix Elements in Spiral Order: ");
        for(int i=1,t=0,b=(row-1),l=0,r=(col-1);i<=(row*col);){
            for(int j=l;(j<=r);i++,j++){
                if(i>(row*col))
                    break;
                System.out.print(mat[t][j]+",");
            }
            t++;
            for(int j=t;(j<=b);i++,j++){
                if(i>(row*col))
                    break;
                System.out.print(mat[j][r]+",");
            }
            r--;
            for(int j=r;(j>=l);i++,j--){
                if(i>(row*col))
                    break;
                System.out.print(mat[b][j]+",");
            }
            b--;
            for(int j=b;(j>=t);i++,j--){
                if(i>(row*col))
                    break;
                System.out.print(mat[j][l]+",");
            }
            l++;
        }
    }
}