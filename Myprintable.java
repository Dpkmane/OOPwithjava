package interf;

public class Myprintable implements Printable{
	@Override
	public void print(String message){
		
		System.out.println("print a msg "+message);
	}
   
}
