package p1;

public class Student extends Person {

	private int grady;
	private double fees;
	
	public Student(String fn,String ln,int grady,double fees) {
		super(fn,ln);
		System.out.println("st");
		this.grady=grady;
		this.fees=fees;
	}

	
	public String toString() {
		return "Student" +super.toString()+"  grady " + grady+ "fees= " + fees  ;
	}

	
	
	
}
