package objectOriented;
import java.util.Scanner;
public class BankAccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you have in your checking and savings account?");
		double checkingsA = input.nextDouble();
		double savingsA = input.nextDouble();
		System.out.println("Whats the interest of your checking and savings account?");
		double checkingsI = input.nextDouble();
		double savingsI = input.nextDouble();
		
		BankAccounts bank = new BankAccounts(checkingsA,savingsA,checkingsI,savingsI);
		bank.depoS(100);
		bank.cintx(1.18);
		bank.depoC(-1000);
		bank.cintx(1.19);
		bank.sintx(1.19);
		bank.financeChargeC(10000);
		System.out.println("Your checkings account value is "+bank.getC());
		System.out.println("Your savings account value is "+bank.getS());
		
		
	}

}
