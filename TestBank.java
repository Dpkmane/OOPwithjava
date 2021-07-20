package bankinterface;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		
		while (!exit) {
			System.out.println("1 : creat a/c in BOB 2 :creat a/c in HDFC 3:withdraw 4: paybill 5: Exit");
			switch (sc.nextInt()) {
			case 1:
				if (ref == null) {
					ref = new BankOfBaroda();
					System.out.println("Enter a/c no name balance");
					ref.creatAcc(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("A/c already chosen");
				break;
			case 2:
				if (ref == null) {
					ref = new HDFC();
					System.out.println("Enter a/c no name balance");
					ref.creatAcc(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("A/c already chosen");
				break;
			case 3:
				if (ref != null) {
					System.out.println("enter a/c & amt to withdraw");
					ref.withdraw(sc.nextInt(), sc.nextDouble());
				} else
					System.out.println("you hav not yet chosen bank");
				break;
			case 4:
				if (ref != null) {
					if (ref instanceof HDFC) {
						((HDFC) ref).paybill();
					} else {
						System.out.println("Choose HDFC Bank to enjoy this facility");
					}
				}
				break;
			case 5:
				exit = true;
				break;

			}
		}
		sc.close();

	}
}
