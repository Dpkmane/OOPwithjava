package abstraction;

public class Manager extends Emp {

	double performBonus;

	public Manager(int id, String name, int dptid, double basic, double performBonus) {
		super(id, name, dptid, basic);
		this.performBonus = performBonus;
	}

	@Override
	public String toString() {
		return "Manager" + super.toString() + "performBonus= " + performBonus;
	}
   @Override
	public double computeNetSal() {

		return getbasic() + performBonus;
	}

	public double getPerformBonus() {

		return performBonus;
	}
}
