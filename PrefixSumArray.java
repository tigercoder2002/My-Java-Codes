// Prefix Sum of Array.
import java.util.*;
class PrefixSumArray {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of array elements: ");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements, seperated by spaces: ");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        for(int i=1;i<n;a[i]+=a[i-1],i++);
        System.out.print("Prefix Sum Array: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
    }
}