// Square Matrix Rotation Clockwise by 90°.
import java.util.*;
class RotaSquMatrClockRtAng{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter Square Matrix Order: ");
        int ord=inp.nextInt();
        int mat[][]=new int[ord][ord];
        System.out.println("Enter the Matrix Elements:");
        for(int i=0;i<ord;i++)
            for(int j=0;j<ord;j++)
                mat[i][j]=inp.nextInt();
        for(int i=0;i<ord;i++)
            for(int j=i;j<ord;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        for(int i=0;i<ord;i++)
            for(int l=0,r=(ord-1);l<=r;l++,r--){
                int temp=mat[i][l];
                mat[i][l]=mat[i][r];
                mat[i][r]=temp;
            }
        System.out.println("Square Matrix Rotated Clockwise by 90°:");
        for(int i=0;i<ord;i++){
            System.out.print("|\t");
            for(int j=0;j<ord;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println("|");
        }
    }
}