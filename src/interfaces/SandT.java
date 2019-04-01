package interfaces;

import java.util.ArrayList;


public class SandT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Teacher());
		people.add(new Student());
		people.add(new Teacher());
		
		for(Person someone: people) {
			if(someone instanceof Teacher) {
				Teacher adult = (Teacher)someone;
				adult.payMe();
			}
		}
		for(Person someone: people) {
			if(someone instanceof Student) {
				System.out.println(someone.getName());
			}
		}
	}

}
