import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
		try{
			int x=sc.nextInt(),
			y=sc.nextInt();
			System.out.println(x/y);
		}catch(InputMismatchException e){
			System.out.println(e.getClass().toString().substring(6));
		}catch(Exception e){
			System.out.println(e);
		}
    }
}