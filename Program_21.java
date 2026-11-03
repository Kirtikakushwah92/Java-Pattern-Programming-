/*
Enter Number :
7
7
6 6
5 5 5
4 4 4 4
3 3 3 3 3
2 2 2 2 2 2
1 1 1 1 1 1 1
*/
import java.util.Scanner;
class Program_21{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		solvePattern(n);
	}
	public static void solvePattern(int n){
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n-i+1;j++){
			 System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}