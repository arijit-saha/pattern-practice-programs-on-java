import java.util.Scanner;
class Pattern_P {
	public static void main(String[] args) {
	Scanner KB=new Scanner(System.in);
	System.out.print("Enter the rows : ");	
	int n = KB.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || (i==0||i==n/2)&&j<n/2+1 || (i>=1&&i<=n/2-1)&&j==n/2+1) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
		System.out.println();
		}
	}
}