package p1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           boolean flag=true;
           for (int i=a;i<=b;i++) {
        	   flag=true;
        	   for(int j=2;j<=i/2;++j) {
        		   
        		   if(i%j == 0) {
        			   
        			   flag=false;
        			   break;
        					   
        		   }
        	   }
        	   if(flag==true) {
            	   System.out.println(i);
               }
           }
          
	}

}
