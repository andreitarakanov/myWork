package objectOriented;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();
		int firstage = bob.getAge();
		System.out.println(firstage);
		bob.setAge(15);
		int secondage = bob.getAge();
		System.out.println(secondage); 
		
	}

}
