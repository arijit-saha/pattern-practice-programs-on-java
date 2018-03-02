import java.util.Scanner;
public class Pattern_V {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i==j&&(j>=0&&j<=n/2) || i+j==n-(n/2-1)+2&&(j>=n&&j<n/2))
						System.out.print("*");
					else
						System.out.print(" ");

				}
			System.out.println();
			}	
	}
}