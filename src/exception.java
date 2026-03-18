import com.sun.source.tree.CatchTree;

public class exception {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int a=10, b=0;
        String str =null;
        try {
            System.out.println(arr[4]);
            System.out.println(a/b);
            System.out.println(str.length());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}