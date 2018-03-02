import java.util.Scanner;
public class Helicopter {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=KB.nextInt();
		for(int i=0 ;i<n; i++) {
			
			for(int j=0; j<n; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<n; j++) {
				System.out.print(" ");
			}

			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i=0 ;i<n; i++) {
			
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2 || j==n/2 || i==j || i+j==n-1
						|| i+j==n/2 || i-j==n/2 || j-i==n/2 || i+j==(n+n/2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
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
		System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(" ");
			}

			for(int j=0; j<n; j++) {
				System.out.print(" ");
			}

			for(int j=n-1; j>i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}























