package abstraction;

import java.util.Scanner;


public class TestOrg {

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Organization employee strength");
			Emp[] data = new Emp[sc.nextInt()];
			boolean flag = false;
			int counter = 0;
			System.out.println("choice");
			System.out.println("1=Hire Manager");
			System.out.println("2=Hire Worker");
			System.out.println("3=Display data");
			System.out.println("10=exit");
			while (!flag) {

				System.out.println("------Choose Option-----");
				switch (sc.nextInt()) {
				case 1:
					if (counter < data.length) {
						System.out.println("Enter Manager Details:id,  name, dptid,  basic,  performBonus");
						data[counter++] = new Manager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					} else
						System.out.println("Not hiring More");
					break;
				case 2:
					if (counter < data.length) {
						System.out.println("Enter worker Details:id,  name, dptid,  basic, hoursWorked,hourlyRate;");
						data[counter++] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
								sc.nextInt());
					} else
						System.out.println("Not hiring More");
					break;
				case 3:
					for (Emp p : data) {
						if (p != null)
							if (p instanceof Manager) {
								System.out.println(p);
								System.out.println("Netsal=" + p.computeNetSal());
								((Manager) p).getPerformBonus();
							} else if (p instanceof Worker) {
								System.out.println(p);
								System.out.println("Netsal" + p.computeNetSal());
								((Worker) p).getHourlyRate();
							}

					}
					break;
				case 10:
					flag = true;
					break;
				default:
					break;
				}
			}
			sc.close();
		}

	}


	


