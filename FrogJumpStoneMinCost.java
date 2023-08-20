// Minimum total possible cost for the frog to jump to 'n' stones.
import java.util.*;
class FrogJumpStoneMinCost{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter the no. of stones for the frog to jump: ");
        int n=inp.nextInt();
        int h[]=new int[n];
        System.out.print("Enter the heights of each stone, seperated by spaces: ");
        for(int i=0;i<n;i++)
            h[i]=inp.nextInt();
        System.out.println("Minimum total possible cost for the frog to jump to "+n+" stones="+frogJumpMinCost(h,0));
    }
    static int frogJumpMinCost(int ht[], int ind){
        if(ind==(ht.length-1))
            return 0;
        int x=frogJumpMinCost(ht,(ind+1))+Math.abs(ht[ind+1]-ht[ind]);
        return (ind==(ht.length-2))?x:Math.min(x,(frogJumpMinCost(ht,(ind+2))+Math.abs(ht[ind+2]-ht[ind])));
    }
}