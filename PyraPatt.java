// Pyramid Pattern.
import java.util.*;
class PyraPatt{
    public static void main(String args[]){
        System.out.print("\fEnter no. of rows: ");
        int r=new Scanner(System.in).nextInt();
        System.out.println("Pyramid Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i);j++)
                System.out.print(" ");
            for(int k=1;k<(2*i);k++)
                System.out.print("*");
            System.out.println();
        }
    }
}