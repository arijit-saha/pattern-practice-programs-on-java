import java.util.Scanner;
public class Hut {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					System.out.print(" ");
				}

				for(int j=0; j<n; j++) {
					if(j==0&&(i>=n/2&&i<=n)
					|| i==n/2&&(j>=0&&j<=n/2)
					|| (i>=n/2&&i<(3*n)/4)&&(j>=0&&j<=n/2)
					|| j==n/2&&(i>=n/2&&i<=n)
					|| (i>(3*n)/4&&i<n-1)&&(j>=0&&j<=n/2))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
			}

			for(int i=0; i<n; i++) {
				for(int j=n-1; j>i; j--) {
					System.out.print(" ");
				}
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				for(int j=0; j<n; j++) {
					System.out.print("*");
				}

				for(int j=0; j<n; j++) {
					System.out.print("*");
				}
				
				for(int j=0; j<n; j++) {
					System.out.print("*");
				}
				
				for(int j=0; j<=n; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i==0 || j==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==0 || j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==0 || j==0&&(i>=n/2&&i<n)
					|| i==n/2&&(j>=0&&j<n) || j==n-1&&(i>=n/2&&i<n)
					|| i==(3*n)/4&&(j>=0&&j<n) || j==n/2&&(i>=n/2&&i<n))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==0)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==0 || j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
			}

			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(j==0 || i==n-1 || j==n/2
					|| i==0&&(j>=n/2&&j<n) || j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==n-1 || j==n-1 || j==n/2
					|| i==0&&(j>=0&&j<n/2))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==n-1 || i==0&&(j>=0&&j<n))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				for(int j=0; j<n; j++) {
					if(i==n-1 || j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
			}		
	}
}