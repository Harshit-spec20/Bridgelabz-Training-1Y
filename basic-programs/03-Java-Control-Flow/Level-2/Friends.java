import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        int aHeight = sc.nextInt();
        int bAge = sc.nextInt();
        int bHeight = sc.nextInt();
        int cAge = sc.nextInt();
        int cHeight = sc.nextInt();
        int youngestAge = Math.min(aAge, Math.min(bAge, cAge));
        int tallestHeight = Math.max(aHeight, Math.max(bHeight, cHeight));
        System.out.println(youngestAge);
        System.out.println(tallestHeight);
    }
}
