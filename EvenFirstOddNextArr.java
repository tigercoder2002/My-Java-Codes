// Even First Odd Next Array.
import java.util.*;
class EvenFirstOddNextArr{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of array elements: ");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements, seperated by spaces: ");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        for(int l=0,r=(n-1);l<r;){
            if((a[l]%2!=0) && (a[r]%2==0)){
                int temp=a[l];
                a[l++]=a[r];
                a[r--]=temp;
            }
            else if(a[l]%2==0)
                l++;
            else if(a[r]%2!=0)
                r--;
        }
        System.out.print("Even First Odd Next Array: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+",");
    }
}