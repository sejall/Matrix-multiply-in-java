
import java.util.Scanner;
class MatrixMultiply
{
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows ");
        int r1=sc.nextInt();
        System.out.print("Enter no of cols ");
        int c1=sc.nextInt();
        int m1[][]=new int[r1][c1];


        System.out.print("Enter no of rows ");
        int r2=sc.nextInt();
        System.out.print("Enter no of cols ");
        int c2=sc.nextInt();
        int m2[][]=new int [r2][c2];


		if(c1!=r2)
		{System.out.print("matrix multiplication not possible");
		System.exit(1);
		}


		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
			{
			System.out.print("enter element"+(i+1)+","+(j+1)+":");
			m1[i][j]=sc.nextInt();
			}


		for(int i=0;i<r2;i++)
			for(int j=0;j<c2;j++)
			{
			System.out.print("enter element"+(i+1)+","+(j+1)+":");
			m2[i][j]=sc.nextInt();
			}
		int m3[][]=new int[r1][c2];


		for(int i=0;i<r1;i++)
		for(int j=0;j<c2;j++)
		for(int k=0;k<c1;k++)
		{
			m3[i][j]+=m1[i][k]*m2[k][j];
		}


		for(int a[]:m3)
		{
		  for(int y:a)
		  {
		  System.out.print(y+"\t");
		  }
		  System.out.println();
		  
		}
          }
}



		
	


		