package bankinterface;

public interface Bank {
	boolean creatAcc(int accno,String name,double inBalance) ;
	void withdraw(int accno,double amt);
		
	

}
