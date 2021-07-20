package p1;

public class Person {
 
	private String fn,ln;

	public Person(String fn, String ln) {
		System.out.println("pr");
		this.fn = fn;
		this.ln = ln;
	}

	
	public String toString() {
		return "Person "+ "fn=" + fn + " ln=" + ln  ;
	}

//	public Person() {
//		super();
//	}
//	
}

