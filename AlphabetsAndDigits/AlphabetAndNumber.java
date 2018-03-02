import java.util.Scanner;
public class AlphabetAndNumber {
	static char ch;
	static int n;
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
		
		do {
			System.out.print("Enter the letter or number : ");
			ch=KB.next().charAt(0);
			System.out.print("Enter the range : ");
			n=KB.nextInt();

		switch(ch) {
			case 'A' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i!=0 && (j==0 || j==n/2)
						   || (i==0 && j>0 && j<n/2) 
						   || (i==n/2 && j>0 && j<n/2))
							System.out.print("*"); 
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			
			case 'B' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 
						   || j==n/2&&(i!=0&&i!=n/2&&i!=n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'C' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((i==0 && j>0) 
						   || (i==n-1 && j>0) 
						   || (j==0 && i!=0 && i!=n-1))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'D' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0||(i==0||i==n-1)&&j<=n/2 
						   || j==n/2+1&&(i!=0&&i!=n-1))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;


			case 'E' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0||(i==0||i==n/2||i==n-1)&&j<n/2 
						   || (i==0||i==n-1)&&j<n/2+2)
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'F' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((j==0||i==0&&j<n/2+2) 
						   || (i==n/2&&j<n/2))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'G' : for(int i=0; i<n; i++) {
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
				System.out.println();
				}
				break;

			case 'H' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0 
						   || (i==n/2&&j<n/2+2) 
						   || (j==n/2+2)) {
						System.out.print("*"); }
						else {
						System.out.print(" "); }
					}
				System.out.println();
				}
				break;

			case 'I' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((i==0&&(j>n/2-3&&j<n/2+3)) 
						   || j==n/2 
						   || (i==n-1&&(j>n/2-3&&j<n/2+3)))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'J' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==n/2+2&&(i>0&&i<n)
							|| i==0&&(j>0&&j<n)
							|| i==n-1&&(j>2&&j<=n/2+1)
							|| j==2&&(i>=n/2&&i<=n-1))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'K' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0 || i+j==n-1 
						   || i==j&&(!(i>=0&&i<=n/2-1)))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'L' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0&&i!=n-1 
						   || j!=0&&i==n-1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'M' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0 || i==j&&(j>0&&j<=n/2) 
						   || i+j==n-(n/2-1)+2&&(j>=n/2&&j<n) 
						   || j==n-1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'N' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((i>=0&&i<=n-1)&&j==0 
						   || i==j 
						   ||(i>=0&&i<=n-1)&&j==n-1)
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'O' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0&&(i>0&&i<n-1) 
						   || (i==0&&(j>0&&j<n/2))
						   || ((i==n-1&&(j>0&&j<n/2))) 
						   || j==n/2&&(i>0&&i<n-1))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'P' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0 
						   || (i==0||i==n/2)&&j<n/2+1 
						   || (i>=1&&i<=n/2-1)&&j==n/2+1)
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'Q' : for(int i=0; i<n; i++) {
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
				System.out.println();
				}
				break;

			case 'R' : for(int i=0; i<n; i++) {
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
				break;
			
			case 'S' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(((i>0&&i<n/2)&&j==0) 
						   || ((i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)) 
						   || ((i>n/2&&i<n-1)&&j==n/2+2))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'T' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==0&&(j>=0&&j<n) 
						   || j==n/2&&(i>0&&i<n))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'U' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(((i>=0&&i<n-1)&&j==0) 
						   || (i==n-1&&(j>0&&j<n/2+2)) 
						   || ((i>=0&&i<n-1)&&j==n/2+2))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'X' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==j || i+j==n-1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'Y' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==j&&(j>=0&&j<=n/2)
						|| i+j==n-(n/2-1)+2&&(j>=n/2&&j<n)
						|| j==n/2&&(i>=n/2&&i<n))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case 'Z' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==0&&(j>=0&&j<n) || i+j==n-1 || i==n-1&&(j>0&&j<n))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;

			case '0' : for(int i=0; i<n; i++) {
						for(int j=0; j<n; j++) {
							if(j==0&&(i>0&&i<n-1)
							|| (i==0&&(j>0&&j<=n/2+1))
							|| ((i==n-1&&(j>0&&j<=n/2+1))) 
							|| j==n/2+2&&(i>0&&i<n-1))
								System.out.print("*");
							else
								System.out.print(" ");
						}
					System.out.println();
					}
					break;
			case '1' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==n/2&&(i>0&&i<n)
						|| (i==0&&(j>=2&&j<=n/2))
						|| (i==n-1&&(j>0&&j<n-1)))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '2' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==n/2+2&&(i>0&&i<n/2)
						|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
						|| j==0&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
				}
				System.out.println();
				}
				break;
			case '3' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==n/2+2&&(i>0&&i<n/2)
						|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
						|| j==n/2+2&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '4' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((j==n/2+2||j==0)&&(i>0&&i<n/2)
						|| i==n/2&&(j>0&&j<=n/2+1)
						|| j==n/2+2&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '5' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0&&(i>0&&i<n/2)
						|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
						|| j==n/2+2&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '6' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j==0&&(i>0&&i<n/2)
						|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
						|| (j==n/2+2||j==0)&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '7' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==0&&(j>0&&j<n-1) || j==n-1&&(i>0&&i<n))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '8' : for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if((j==n/2+2||j==0)&&(i>0&&i<n/2)
						|| (i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2+1)
						|| (j==n/2+2||j==0)&&(i>n/2&&i<n-1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				System.out.println();
				}
				break;
			case '9' : for(int i=0; i<n; i++) {
					System.out.println();
					}
				break;

			default : System.out.println("Not a valid input. Try again...");
				  break;
		}
		}while((ch>='A' && ch<='Z') || (ch>=1 && ch<=9));
	KB.close();
	}
}
