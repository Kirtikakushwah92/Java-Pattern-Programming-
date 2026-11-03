/*
Enter Number :
7
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
*/
import java.util.Scanner;
class Program_17{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		solvePattern(n);
	}
	public static void solvePattern(int n){
		for(int i=1;i<=n;i++){

			for(int j=1 ; j<=i;j++){
				System.out.print(i+ " ");
			}
			System.out.println();
			
		}
		
	}
}