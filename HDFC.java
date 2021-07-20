package bankinterface;

public class HDFC implements Bank {
public static final double MINBALANCE;
static {
	MINBALANCE=5000;
}
	@Override
	public boolean creatAcc(int accno, String name, double inBalance) {
		if(inBalance>MINBALANCE) {
			System.out.println("acc cretat in hdfc");
		}else
		System.out.println("insuff opening balance");
		return false;
	}

	@Override
	public void withdraw(int accno, double amt) {
	System.out.println("wthdraw from hdfc");

	}
	public void paybill() {
		System.out.println("paying bill hdfc");
	}

}
