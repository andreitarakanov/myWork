package arrays;
import java.util.Scanner;
public class MallSantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name = null;
		MallSanta[] arr = new MallSanta[4];
		int age = 0;
		Boolean crec = false;
		for(int i = 0;i<4;i++)
		{
			System.out.println("Whats your name Santa number "+(i+1));
			name = input.nextLine();
			
			System.out.println("Whats your age Santa number "+(i+1));
			age = input.nextInt();
			System.out.println("Whats your criminal record Santa number "+(i+1));
			crec = input.nextBoolean();
			arr[i] = new MallSanta(name,age,crec);
			input.nextLine();
		}
		for(int i = 0;i<4;i++)
		{
			if(arr[i].employable()==true)
			{
				System.out.println(arr[i].getName());
			}
		}
		
	}

}
