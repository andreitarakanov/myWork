package inputoutput;

import java.util.*;
import java.io.*;

public class TestingClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File coolerdated = new File("C:/Users/22tar/Downloads/Cool.txt");
		File cooleroutdated = new File("Cool.txt");
		File coolerdatedoutput = new File("C:/Users/22tar/Downloads/Cooler.txt");
		PrintWriter output1 = new PrintWriter(coolerdatedoutput);
		Scanner input = new Scanner(coolerdated);
		while (input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
		input.close();
		output1.println("Cooler gaming time");
		output1.close();

	}

}
