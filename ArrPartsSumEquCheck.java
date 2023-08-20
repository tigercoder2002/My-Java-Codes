// Array Partitions Sum Equality Checker.
import java.util.*;
class ArrPartsSumEquCheck{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of array elements: ");
        int n=inp.nextInt();
        int a[]=new int[n];
        int tsum=0;
        System.out.print("Enter the elements, seperated by spaces: ");
        for(int i=0;i<n;tsum+=a[i],i++)
            a[i]=inp.nextInt();
        System.out.print("Enter the position to check whether the array elements at that point can be equally divided on basis of sum: ");
        int pos=inp.nextInt(), psum=0;
        for(int i=0;i<pos;psum+=a[i],i++);
        if(psum==(tsum-psum))
            System.out.print("The array elements at this point can be equally divided on basis of sum= "+psum);
        else
            System.out.print("The array elements at this point cannot be equally divided on basis of sum.");
    }
}