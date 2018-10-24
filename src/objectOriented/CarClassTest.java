package objectOriented;
import java.util.Scanner;
public class CarClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		CarClass momsCar = new CarClass();
		CarClass dadsCar = new CarClass();
		CarClass kidsCar = new CarClass();
		System.out.println("How far did you drive dads car?");
		double firstDrive = input.nextDouble();
		dadsCar.driveCar(firstDrive);
		System.out.println("How much gas are you getting for Mom?");
		double gasPurchased1 = input.nextDouble();
		momsCar.fillTank(gasPurchased1);
		System.out.println("How far did you drive kids car?");
		double secondDrive = input.nextDouble();
		kidsCar.driveCar(secondDrive);
		System.out.println("How much gas are you getting for Dad?");
		double gasPurchased2 = input.nextDouble();
		dadsCar.fillTank(gasPurchased2);
		System.out.println("Moms Car has "+momsCar.getFuel()+" gallons left.");
		System.out.println("Moms Car has driven "+momsCar.getOdo()+" miles.");
		System.out.println("Dads Car has "+dadsCar.getFuel()+" gallons left.");
		System.out.println("Dads Car has driven "+dadsCar.getOdo()+" miles.");
		System.out.println("Kids Car has "+kidsCar.getFuel()+" gallons left.");
		System.out.println("Kids Car has driven "+kidsCar.getOdo()+" miles.");
		
		
	}

}
