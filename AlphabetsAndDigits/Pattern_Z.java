import java.util.Scanner;
public class Pattern_Z {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(i==0&&(j>=0&&j<n) || i+j==n-1 || i==n-1&&(j>0&&j<n))
						System.out.print("*");
					else
						System.out.print(" ");

				}
			System.out.println();
			}	
	}
}