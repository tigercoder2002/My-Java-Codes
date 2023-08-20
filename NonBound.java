// Summation of non-boundary elements in matrix.
import java.util.*;
class NonBound{
    static Scanner inp=new Scanner(System.in);
    int arr[][];
    int n;
    NonBound(int mm){
        n=mm;
        arr=new int[n][n];
    }
    void fillarray(){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                System.out.print("Enter matrix element of Row-no. "+(i+1)+" and Column-no. "+(j+1)+": ");
                arr[i][j]=inp.nextInt();
            }
        }
    void sum_of_non(){
        int sum=0;
        for(int i=1;i<(n-1);i++)
            for(int j=1;j<(n-1);j++)
                sum+=arr[i][j];
        System.out.print("Sum of non-boundary elements of matrix="+sum);
    }
    void show(){
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++){
            System.out.print("| ");
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println("|");
        }
    }
    public static void main(String args[]){
        System.out.print("\fEnter the order of matrix: ");
        NonBound obj=new NonBound(inp.nextInt());
        obj.fillarray();  obj.show();  obj.sum_of_non();
    }
}