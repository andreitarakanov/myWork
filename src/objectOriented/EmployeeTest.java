package objectOriented;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bob = new Employee();
		double wage = bob.getWage();
		System.out.println(wage);
		bob.setWage(7.25);
		wage = bob.getWage();
		System.out.println(wage);
		
		double xp = bob.getXP();
		System.out.println(xp);
		bob.setXP(7);
		xp = bob.getWage();
		System.out.println(xp);
		
		
		//raise time
		bob.raise();
		wage = bob.getWage();
		System.out.println(wage);
		bob.raise();
		wage = bob.getWage();
		System.out.println(wage);
	}

}
