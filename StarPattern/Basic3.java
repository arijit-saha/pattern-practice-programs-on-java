import java.util.Scanner;
public class Basic3 {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the row : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=n-1; j>=i; j--) {
					System.out.print(" ");
				}
				
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
	}
}