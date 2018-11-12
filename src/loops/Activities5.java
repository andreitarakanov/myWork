package loops;
import java.util.Scanner;
public class Activities5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int xi = 0;
		while(i!=9999)
		{
			System.out.println("Please enter a number. (9999 to quit)");
			xi = input.nextInt();
			num = xi*2;
			System.out.println("Your number is "+num);
			i = xi;
		}
	}

}
