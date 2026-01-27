import java.util.Scanner;
class CheckPositiveNegativeZero{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0){
			System.out.print("Positive");
		}else if(num==0){
			System.out.print("Zero");
		}else {
			System.out.print("Negative");
		}
	}
}