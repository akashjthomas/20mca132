//Read 2 matrices from the console and perform matrix addition.
import java.util.Scanner;
public class pgm2{
	public static void main(String[] args)
	{ 
	    Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of rows and column");
		int p=sc.nextInt();
		int q=sc.nextInt();
		 
		 System.out.println("enter the elements of first matrix");
		 int a[][]=new int[p][q];
		 for(int i=0;i<p;i++){
			  for(int j=0;j<q;j++){
				  a[i][j]=sc.nextInt();
			  }
		 }
		System.out.println("enter the elements of second matrix");
		 int b[][]=new int[p][q];
		 for( int i=0;i<p;i++){
			  for( int j=0;j<q;j++){
				  b[i][j]=sc.nextInt();
			  }
		 }
System.out.println("added matrix");
		 int sum[][]=new int[p][q];
		 for(int i=0;i<p;i++){
			  for( int j=0;j<q;j++){
				  sum[i][j]=a[i][j]+b[i][j];
				
			
	}
	for( int i=0;i<p;i++){
			  for( int j=0;j<q;j++){
	System.out.println("add matrix is:" +sum[i][j]+"");
}
	}
}
	}
}
	