/*
Enter Number :
7
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1
*/
import java.util.Scanner;
class Program_20{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		solvePattern(n);
	}
	public static void solvePattern(int n){
		for(int i=1;i<=n;i++){
			
			
			for(int j=1 ; j<=i;j++){
				if(j%2==0){
					System.out.print(0+" ");
				}
				else{
					System.out.print(1+" ");
				}	
			}
			System.out.println();
			
		}
		
	}
}