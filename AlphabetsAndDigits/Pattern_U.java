import java.util.Scanner;
class Pattern_U {
	public static void main(String[] args) {
	Scanner KB=new Scanner(System.in);
	System.out.print("Enter the rows : ");	
	int n = KB.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(((i>=0&&i<n-1)&&j==0) || (i==n-1&&(j>0&&j<n/2+2)) || ((i>=0&&i<n-1)&&j==n/2+2)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
		System.out.println();
		}
	}
}