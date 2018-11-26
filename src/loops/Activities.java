package loops;
import java.util.Scanner;
public class Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want?");
		int c = input.nextInt();
		int s = 0;
		while(i<=c)
		{
		
			s+=i;
			System.out.println(s);
			i+=2;
		}
	}

}
