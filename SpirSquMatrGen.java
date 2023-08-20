// Spiral Square Matrix Generator.
import java.util.*;
class SpirSquMatrGen{
    public static void main(String args[]){
        System.out.print("\fEnter Order of Spiral Square Matrix: ");
        int n=new Scanner(System.in).nextInt();
        int mat[][]=new int[n][n];
        for(int i=1,t=0,b=(n-1),l=0,r=(n-1);i<=(n*n);){
            for(int j=l;j<=r;mat[t][j]=i++,j++);
            t++;
            for(int j=t;j<=b;mat[j][r]=i++,j++);
            r--;
            for(int j=r;j>=l;mat[b][j]=i++,j--);
            b--;
            for(int j=b;j>=t;mat[j][l]=i++,j--);
            l++;
        }
        System.out.println("Spiral Square Matrix:");
        for(int i=0;i<n;i++){
            System.out.print("|\t");
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println("|");
        }
    }
}