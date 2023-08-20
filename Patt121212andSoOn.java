// 1212... Pattern.
import java.util.*;
class Patt121212AndSoOn{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of rows and columns, separated by spaces: ");
        int r=inp.nextInt(), c=inp.nextInt();
        System.out.println("\"121212......\" Pattern:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++)
                System.out.print(((i+j)%2==0)?1:2);
            System.out.println();
        }
    }
}   