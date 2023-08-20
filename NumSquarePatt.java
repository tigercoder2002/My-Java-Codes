// Numerical Square Pattern.
import java.util.*;
class NumSquarePatt{
    public static void main(String args[]){
        System.out.print("\fEnter no. of rows: ");
        int r=new Scanner(System.in).nextInt();
        System.out.println("Numerical Square Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r;j++)
                System.out.print(j+" ");
            for(int k=1;k<i;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}