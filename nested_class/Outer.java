package nested_class;

public class Outer {
	private int i;
	private static int j;
	static {
		j=100;
	}
//	constructer 
	public Outer(int i) {   
		super();
		this.i = i;
	}
	//static method of the outer class
	public static void show()
	{
		System.out.println("outer's static method "+j);
	}
	//non static method
	public  void display()
	{
		System.out.println("outer non-static method "+i+" "+j);
	}
//	public void linkadhar(String uid,String creationDate) {
//		this.adharcard=new Adharcard(uid,sdf.parse(creationDate));
//	}
//	c1.linkadhar(sc.next(),sc.next());
//	sop(c1);
	//nested class : class declared within outer class --non static nested class
	 class Inner
	{
		private int k;
//		private static int l;
		private static final int l=1234;
//		static {
//			l=1234;
//		}
		//constr 
		public Inner(int k) {
			this.k=k;
		}
		//static method
//		static void test()
//		{
//			
//		}
		//non static method
		public void innerShow()
		{
			System.out.println("inner's details "+k+" "+l);
			System.out.println("outer's private members "+i+" "+j);
		}
		
	}
	
}
