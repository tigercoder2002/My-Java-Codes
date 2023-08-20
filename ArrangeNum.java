// Sorting of digits of a no.
import java.util.*;
class ArrangeNum{
    int n;
    int s[];
    ArrangeNum(int nn){
        n=nn;
        s=new int[(n+"").length()];
    }
    void fill_array(){
        for(int i=(s.length-1),x=n;i>=0;x/=10,i--)
            s[i]=x%10;
        }
    void arrange(){
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s.length-i-1;j++)
                if(s[j]>s[j+1]){
                    int temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
    void show(){
        System.out.println("Original no.: "+n);
        System.out.print("Sorted no.: ");
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]);
        }
    public static void main(String args[]){
        System.out.print("\fEnter a no.: ");
        ArrangeNum obj=new ArrangeNum(new Scanner(System.in).nextInt());
        obj.fill_array();   obj.arrange();  obj.show();
    }
}