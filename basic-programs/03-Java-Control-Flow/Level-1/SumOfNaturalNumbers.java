import java.util.Scanner;
class SumOfNaturalNumbers{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0){
			int sum=(num*(num+1))/2;
			System.out.print("The sum of "+num+" natural numbers is "+sum);
		}else{
			System.out.print("The number "+num+" is not a natural number");
		}
	}
}