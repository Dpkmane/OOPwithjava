package bankinterface;

public class BankOfBaroda implements Bank {
	public static final double MINBALANCE;
	static {
		MINBALANCE=1000;
	}
	public boolean creatAcc(int accno, String name, double inBalance) {
   if(inBalance>MINBALANCE) {
	   System.out.println("ACC created BOB");
	   return true;
   }
   System.out.println("insufficient opening balance");
		return false;
	}

	public void withdraw(int accno, double amt) {
  System.out.println("withdrawing from BOB");
	}
}
