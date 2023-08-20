// Hollow Rectangular Pattern.
import java.util.*;
class HollRectPatt{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of rows and columns, separated by spaces: ");
        int r=inp.nextInt(), c=inp.nextInt();
        System.out.println("Hollow Rectangular Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((j==1) || (j==c) || (i==1) || (i==r))
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}
