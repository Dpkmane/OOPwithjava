package interf;

public class TesterPrint {

	public static void main(String[] args) {
		Myprintable mp=new Myprintable();
		mp.print("hiiiiiiiiii");
		FilePrint fp=new FilePrint();
		fp.print(" how r u");
	}

}
