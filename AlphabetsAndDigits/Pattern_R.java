import java.util.Scanner;
public class Pattern_R {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int n=KB.nextInt();
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(j==0&&(i>0&&i<n&&i!=n/2)
					|| i==0&&(j>0&&j<(3*n)/4)
					|| i==n/2&&(j>0&&j<(3*n)/4)
					|| j==(3*n)/4&&(i>0/2&&i<n/2)
					|| i-j==n/2-1)
						System.out.print("*");
					else
						System.out.print(" ");

				}
			System.out.println();
			}	
	}
}