// GCD Using Euclid's Algorithm.
import java.util.*;
class GCDByEucAlgo{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter two nos. seperated by spaces: ");
        int a=inp.nextInt(), b=inp.nextInt();
        System.out.println("GCD="+gcdEucAlg(a,b));
    }
    static int gcdEucAlg(int x, int y){
        return (y==0)?x:gcdEucAlg(y,(x%y));
    }
}