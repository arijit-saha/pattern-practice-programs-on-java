import java.util.Scanner;
public class DEEPANSHU {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the nnumber of rows : ");
		int n=KB.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n-1)&&j<=n/2 || j==n/2+1&&(i!=0&&i!=n-1)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 || (i==0||i==n-1)&&j<n/2+2) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 || (i==0||i==n-1)&&j<n/2+2) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			
			for(int j=0; j<n; j++) {
				if(j==0 || (i==0||i==n/2)&&j<n/2+1 || (i>=1&&i<=n/2-1)&&j==n/2+1) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			for(int j=0; j<n; j++) {
				if(i!=0 && (j==0 || j==n/2) || (i==0 && j>0 && j<n/2) || (i==n/2 && j>0 && j<n/2)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			for(int j=0; j<n; j++) {
				if(((i>=0&&i<=n-1)&&j==0) || (i==j) ||((i>=0&&i<=n-1)&&j==n-1)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			
			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}
			
			
			for(int j=0; j<n; j++) {
				if(((i>0&&i<n/2)&&j==0) || ((i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)) || ((i>n/2&&i<n-1)&&j==n/2+2)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
			
			for(int j=0; j<n; j++) {
				if(j==0 || (i==n/2&&j<n/2+2) || (j==n/2+2)) {
				System.out.print("*"); }
				else {
				System.out.print(" "); }
			}
			
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