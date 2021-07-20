package abstraction;

public abstract class Emp {
	private int id;
	private String name;
	private int dptid;
	private double basic;

	public Emp(int id, String name, int dptid, double basic) {

		this.id = id;
		this.name = name;
		this.dptid = dptid;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dptid=" + dptid + ", basic=" + basic + "]";
	}

	public abstract double computeNetSal();
	

	public double getbasic() {
		return basic;
	}
}
