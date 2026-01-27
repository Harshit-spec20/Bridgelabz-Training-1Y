// Creating Class with name DivisibleByFive indicating the purpose is to
// check the number is divisible by five
import java.util.Scanner;
class DivisibleByFive{
	public static void main(String [] args){
		// Creat a scanner object
		Scanner sc=new Scanner(System.in);
		// Get input value 
		int number=sc.nextInt();
		System.out.print("Is the number "+number+" divisible by 5? ");
		// Check the number is divisible by five or not
	if(number%5==0){
		System.out.print("Yes");
	} else{
		System.out.print("No");
	}
	}
}