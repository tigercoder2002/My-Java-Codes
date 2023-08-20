// Rectangular Sum between any two points in a Matrix using Prefix Sum Method.
import java.util.*;
class RectSumMatrByPrefSumMeth{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter Matrix Dimension, seperated by spaces: ");
        int r=inp.nextInt(), c=inp.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the Matrix Elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=inp.nextInt();
        for(int i=0;i<r;i++)
            for(int j=1;j<c;mat[i][j]+=mat[i][j-1],j++);            // Row-wise Prefix Sum.
        for(int i=0;i<c;i++)
            for(int j=1;j<r;mat[j][i]+=mat[j-1][i],j++);            // Column-wise Prefix Sum.
        System.out.print("Enter first rectangular coordinates: ");
        int x1=inp.nextInt(), y1=inp.nextInt();
        System.out.print("Enter second rectangular coordinates: ");
        int x2=inp.nextInt(), y2=inp.nextInt();
        int rsum=mat[x2-1][y2-1];
        rsum+=((x1>=2) && (y1>=2))?mat[x1-2][y1-2]:0;
        rsum-=(x1>=2)?mat[x1-2][y2-1]:0;
        rsum-=(y1>=2)?mat[x2-1][y1-2]:0;
        System.out.println("Required Rectangular Sum="+rsum);
    }
}