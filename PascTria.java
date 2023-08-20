// Pascal's Triangle.
import java.util.*;
class PascTria{
    public static void main(String args[]){
        System.out.print("\fEnter no. of rows of Pascal's Triangle: ");
        int n=new Scanner(System.in).nextInt();
        int pasc[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<=i;pasc[i][j]=((j==0) || (j==i))?1:(pasc[i-1][j]+pasc[i-1][j-1]),j++);
        System.out.println("Pascal's Triangle:");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(pasc[i][j]+" ");
            System.out.println();
        }
    }
}