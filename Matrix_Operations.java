// Matrix Operations on same-order matrices.
import java.util.*;
class Matrix_Operations{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.print("\fEnter no. of rows and columns for both the matrices, seperated by spaces: ");
		int r=inp.nextInt(), c=inp.nextInt();
		int mat1[][]=new int[r][c];
		int mat2[][]=new int[r][c];
		// Matrix 1 input.
		for(int i=0;i<mat1.length;i++)
			for(int j=0;j<mat1[i].length;j++){
				System.out.print("Enter element for Row "+(i+1)+", Column "+(j+1)+" for Matrix 1: ");
				mat1[i][j]=inp.nextInt();
				}
		// Matrix 2 input.
		for(int i=0;i<mat2.length;i++)
			for(int j=0;j<mat2[i].length;j++){
				System.out.print("Enter element for Row "+(i+1)+", Column "+(j+1)+" for Matrix 2: ");
				mat2[i][j]=inp.nextInt();
				}
		// Addition of Matrices.
		int addmat[][]=new int[r][c];
		for(int i=0;i<mat1.length;i++)
			for(int j=0;j<mat1[i].length;addmat[i][j]=mat1[i][j]+mat2[i][j],j++);
		// Subtraction of Matrices.
		int submat[][]=new int[r][c];
		for(int i=0;i<mat1.length;i++)
			for(int j=0;j<mat1[i].length;submat[i][j]=mat1[i][j]-mat2[i][j],j++);
		// Result display.
		System.out.println("Addition Result: ");
		for(int i=0;i<addmat.length;i++){
			System.out.print("|\t");
			for(int j=0;j<addmat[i].length;j++)
				System.out.print(addmat[i][j]+"\t");
			System.out.println("|");
			}
		System.out.println("\nSubtraction Result: ");
		for(int i=0;i<submat.length;i++){
			System.out.print("|\t");
			for(int j=0;j<submat[i].length;j++)
				System.out.print(submat[i][j]+"\t");
			System.out.println("|");
			}
		}  }