package inheritance;

public class Friends {
	private String name;
	private int age;
	
	
	Friends(String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}