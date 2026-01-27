import java.util.Scanner;
class LargestOfThreeNumbers{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		    String a="No";
			String b="No";
			String c="No";
		if(num1>num2&&num1>num3){
			 a="Yes";
		}else if(num2>num1 && num2>num3){
			 b="Yes";
		}else if(num3>num1 && num3>num2){
			 c="Yes";
		}
		System.out.println("Is the first number the largest?"+a);
		System.out.println("Is the second number the largest?"+b);
		System.out.println("Is the third number the largest?"+c);
	}
}