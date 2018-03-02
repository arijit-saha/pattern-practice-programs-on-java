import java.util.Scanner;
class Pattern_G {
	public static void main(String[] args) {
	Scanner KB=new Scanner(System.in);
	System.out.print("Enter the rows : ");	
	int n = KB.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if( j==0&&(i>0&&i<n-1)
					|| (i==0&&j>0)
					|| i==n-1&&(j>0&&j<n/2)
					|| (j==n/2||j==n-1)&&(i>=3*(n/4)&&i<n)
					|| i==3*(n/4)&&(j>n/2&&j<n)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
		System.out.println();
		}
	}
}