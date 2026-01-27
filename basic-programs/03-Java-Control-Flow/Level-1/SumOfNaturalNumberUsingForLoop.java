import java.util.Scanner;
class SumOfNaturalNumberUsingForLoop{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int forsum=0;
		int FormulaSum;
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		int a=number;
		if(number<0){
			System.out.print("Not a natural number");
		}else {
			FormulaSum=(number*(number+1))/2;
			for(int i=1;i<=number;i++){
				forsum=forsum+a;
				a--;
			}
			System.out.println("Sum using for loop: "+forsum);
			System.out.println("Sum using formula: "+FormulaSum);
			if(forsum==FormulaSum){
				System.out.println("Both results are correct and equal");
			}else {
				System.out.println("Both results are not correct and equal");
			}
		}
	}
}