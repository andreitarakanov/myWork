package interfaces;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> anim = new ArrayList<Animal>();

		anim.add(new Cat());
		anim.add(new Dog());
		anim.add(new Cat());
		anim.add(new Dog());
		anim.add(new Cat());
		anim.add(new Dog());

		for (Animal temp : anim) {
			temp.act();
			System.out.println(temp.toString());
		}

		for (Animal temp : anim) {
			if (temp instanceof Dog) {
				((Dog) temp).vet();
			}
		}

		int last = -999;
		for (int i = 0; i < anim.size(); i++) {
			if (anim.get(i) instanceof Cat) {
				if (((Cat) anim.get(i)).getFriendly() == false && i > last) {
					last = i;
				}
			}
		}
		anim.remove(last);
		System.out.println("---------------------------------");
		for(Animal temp : anim)
		{
			System.out.println(temp.toString());
		}
	}

}
