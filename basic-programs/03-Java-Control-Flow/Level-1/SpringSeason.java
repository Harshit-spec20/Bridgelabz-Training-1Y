import java.util.Scanner;
class SpringSeason{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date: ");
		int date=sc.nextInt();
		System.out.println("Enter month: ");
		int month=sc.nextInt();
		if((month==3 && date>=20) || (month==4) || (month==5) || (month==6 && date<=20)){
		System.out.println("Its a Spring Season");}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}