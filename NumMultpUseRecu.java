// 'k' Multiples of a Number using Recursion.
import java.util.*;
class NumMultpUseRecu{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("\fEnter a number: ");
        int num=inp.nextInt(), k=0;
        for(;k<=0;){
            System.out.print("Enter the number of non-zero multiples of that number: ");
            k=inp.nextInt();
        }
        System.out.print(k+" multiples of "+num+": ");
        printMults(num,k);
    }
    static void printMults(int n, int m){
        if(m==0)
            return;
        printMults(n,(m-1));
        System.out.print((n*m)+", ");
    }
}