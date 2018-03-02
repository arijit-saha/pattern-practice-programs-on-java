import java.util.Scanner;
public class AtoZ {
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		System.out.print("Enter the nnumber of rows : ");
		int n=KB.nextInt();
		
		for(int i=0; i<n; i++) {
			//A
			for(int j=0; j<n; j++) {
				if(i!=0 && (j==0 || j==n/2) || (i==0 && j>0 && j<n/2) || (i==n/2 && j>0 && j<n/2))
					System.out.print("*"); 
				else
					System.out.print(" ");
			}
			
			//B
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 || j==n/2&&(i!=0&&i!=n/2&&i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//C
			for(int j=0; j<n; j++) {
				if((i==0 && j>0) || (i==n-1 && j>0) || (j==0 && i!=0 && i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//D
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n-1)&&j<=n/2 || j==n/2+1&&(i!=0&&i!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//E
			for(int j=0; j<n; j++) {
				if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 || (i==0||i==n-1)&&j<n/2+2)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//F
			for(int j=0; j<n; j++) {
				if((j==0||i==0&&j<n/2+2) || (i==n/2&&j<n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//G
			for(int j=0; j<n; j++) {
				if( j==0&&(i>0&&i<n-1)
					|| (i==0&&j>0)
					|| i==n-1&&(j>0&&j<n/2)
					|| (j==n/2||j==n-1)&&(i>=3*(n/4)&&i<n)
					|| i==3*(n/4)&&(j>n/2&&j<n))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//H
			for(int j=0; j<n; j++) {
				if(j==0 || (i==n/2&&j<n/2+2) || (j==n/2+2)) {
					System.out.print("*"); }
				else {
					System.out.print(" "); }
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//I
			for(int j=0; j<n; j++) {
				if((i==0&&(j>n/2-3&&j<n/2+3)) || j==n/2 || (i==n-1&&(j>n/2-3&&j<n/2+3)))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//J
			for(int j=0; j<n; j++) {
				if(j==n/2+2&&(i>0&&i<n)
					|| i==0&&(j>0&&j<n)
					|| i==n-1&&(j>2&&j<=n/2+1)
					|| j==2&&(i>=n/2&&i<=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//K
			for(int j=0; j<n; j++) {
				if(j==0 || i+j==n-1 || i==j&&(!(i>=0&&i<=n/2-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//L
			for(int j=0; j<n; j++) {
				if(j==0&&i!=n-1 || j!=0&&i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//M
			for(int j=0; j<n; j++) {
				if(j==0 || i==j&&(j>0&&j<=n/2) || i+j==n-(n/2-1)+1&&(j>=n/2&&j<n) || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//N
			for(int j=0; j<n; j++) {
				if(((i>=0&&i<=n-1)&&j==0) || (i==j) ||((i>=0&&i<=n-1)&&j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//O
			for(int j=0; j<n; j++) {
				if(j==0&&(i>0&&i<n-1) || (i==0&&(j>0&&j<n/2))|| ((i==n-1&&(j>0&&j<n/2))) || j==n/2&&(i>0&&i<n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//P
			for(int j=0; j<n; j++) {
				if(j==0 || (i==0||i==n/2)&&j<n/2+1 || (i>=1&&i<=n/2-1)&&j==n/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			//Q
			for(int j=0; j<n; j++) {
				if(j==0&&(i>0&&i<n/2)
				|| i==0&&(j>0&&j<n/2)
				|| i==n/2&&(j>0&&j<n/2)
				|| j==n/2&&(i>0/2&&i<n/2)
				|| i==j&&(i>=n/4&&i<=(3*n)/4))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//R
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

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//S
			for(int j=0; j<n; j++) {
				if(((i>0&&i<n/2)&&j==0) || ((i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)) || ((i>n/2&&i<n-1)&&j==n/2+2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//T
			for(int j=0; j<n; j++) {
				if(i==0&&(j>=0&&j<n) || j==n/2&&(i>0&&i<n))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//U
			for(int j=0; j<n; j++) {
				if(((i>=0&&i<n-1)&&j==0) || (i==n-1&&(j>0&&j<n/2+2)) || ((i>=0&&i<n-1)&&j==n/2+2))
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//X
			for(int j=0; j<n; j++) {
					if(i==j || i+j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//Y
			for(int j=0; j<n; j++) {
					if(i==j&&(j>=0&&j<=n/2)
						|| i+j==n-(n/2-1)+2&&(j>=n/2&&j<n)
						|| j==n/2&&(i>=n/2&&i<n))
						System.out.print("*");
					else
						System.out.print(" ");
			}

			for(int a=0; a<=1; a++) {
				for(int b=0; b<=1; b++) {
					System.out.print(" ");
				}
			}

			//Z
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