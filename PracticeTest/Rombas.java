import java.util.Scanner;

public class Rombas {
	public static void main( String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=KB.nextInt();

		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i=0; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}

		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	KB.close();
	}
}