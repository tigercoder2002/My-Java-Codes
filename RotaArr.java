// Numerical Square Pattern.
import java.util.*;
class RotaArr{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter no. of array elements: ");
        int n=inp.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the order of rotation: ");
        int k=inp.nextInt();
        System.out.print("Enter the elements, seperated by spaces: ");
        for(int i=0;i<n;i++)
            a[i]=inp.nextInt();
        int arr[]=new int[n];
        int j=0;
        for(int i=(n-k%n);i<n;arr[j]=a[i],j++,i++);
        for(int i=0;i<(n-k%n);arr[j]=a[i],j++,i++);
        System.out.print("Rotated Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+",");
        }
    }