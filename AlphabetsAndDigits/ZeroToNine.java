import java.util.Scanner;
public class ZeroToNine {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the nnumber of rows : ");
		int n=KB.nextInt();
		
		for(int i=0; i<n; i++) {
			//0
			for(int j=0; j<n; j++) {
							if(j==0&&(i>0&&i<n-1)
							|| (i==0&&(j>0&&j<=n/2+1))
							|| ((i==n-1&&(j>0&&j<=n/2+1))) 
							|| j==n/2+2&&(i>0&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//1
			for(int j=0; j<n; j++) {
							if(j==n/2&&(i>0&&i<n)
							|| (i==0&&(j>=2&&j<=n/2))
							|| (i==n-1&&(j>0&&j<n-1)))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//2
			for(int j=0; j<n; j++) {
							if(j==n/2+2&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| j==0&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//3
			for(int j=0; j<n; j++) {
							if(j==n/2+2&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| j==n/2+2&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//4
			for(int j=0; j<n; j++) {
							if((j==n/2+2||j==0)&&(i>=0&&i<n/2)
							|| i==n/2&&(j>0&&j<=n/2+1)
							|| j==n/2+2&&(i>n/2&&i<=n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//5
			for(int j=0; j<n; j++) {
							if(j==0&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| j==n/2+2&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//6
			for(int j=0; j<n; j++) {
							if(j==0&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| (j==n/2+2||j==0)&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//7
			for(int j=0; j<n; j++) {
							if(i==0&&(j>0&&j<n-1) || j==n-1&&(i>0&&i<n))
								System.out.print("*");
							else
								System.out.print(" ");
						}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}
			//8
			for(int j=0; j<n; j++) {
							if((j==n/2+2||j==0)&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| (j==n/2+2||j==0)&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			//9
			for(int j=0; j<n; j++) {
							if((j==n/2+2||j==0)&&(i>0&&i<n/2)
							|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
							|| j==n/2+2&&(i>n/2&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
			


		System.out.println();
		}
	}
}