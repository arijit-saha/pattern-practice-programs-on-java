import java.util.Scanner;
public class Pattern_X {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i==j || i+j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");

				}
			System.out.println();
			}	
	}
}