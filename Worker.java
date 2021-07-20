package abstraction;

public class Worker extends Emp {
	private int hoursWorked, hourlyRate;

	public Worker(int id, String name, int dptid, double basic, int hoursWorked, int hourlyRate) {
		super(id, name, dptid, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Worker " + super.toString() + "hoursWorked "+ hoursWorked + " hourlyRate=" + hourlyRate + "";
	}

	public double computeNetSal() {
		return getbasic() + (hoursWorked * hourlyRate);
	}

	public int getHourlyRate() {
		return hourlyRate;
	}
}
