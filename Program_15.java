import java.util.Scanner;
class Program_15{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		solvePattern(n);
	}
	public static void solvePattern(int n){
		for(int i=1;i<=n;i++){
			// loop for space
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			for(int j=1 ; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
}