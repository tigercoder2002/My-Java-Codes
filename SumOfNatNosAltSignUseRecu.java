// Sum of 'n' Natural Nos. but with alternate signs.
import java.util.*;
class SumOfNatNosAltSignUseRecu{
     public static void main(String args[]){
        System.out.print("\fEnter the no. of Natural Nos.: ");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Sum of Natural Nos. with Alternate Signs="+sumAltSign(n));
    }
    static int sumAltSign(int x){
        return (x==0)?0:((x%2==0)?(sumAltSign(x-1)-x):(sumAltSign(x-1)+x));
    }
}