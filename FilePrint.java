package interf;

public class FilePrint implements Printable {
	
	@Override
	public void print(String mesg) {
		System.out.println("print msg in file"+mesg);
	}
}
