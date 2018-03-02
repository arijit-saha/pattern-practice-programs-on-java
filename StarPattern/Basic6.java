import java.util.Scanner;
public class Basic6 {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			
			for(int x=0; x<n; x++) {
				for(int y=0; y<n; y++) {
					if(y==0 || y==n-1 || x==0 || x==n-1 || x==n/2 || y==n/2 || x==y || x+y==n-1
						|| x+y==n/2 || x-y==n/2 || y-x==n/2 || x+y==(n+n/2)-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}

				for(int j=0; j<n; j++) {
					System.out.print("*");
				}
			System.out.println();
			}

			for(int a=0; a<n; a++) {
				for(int b=n-1; b>a; b--) {
					System.out.print("*");
				}
			System.out.println();
			}
	}
}