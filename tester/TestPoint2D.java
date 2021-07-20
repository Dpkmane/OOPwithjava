package com.tester;
import java.util.Scanner;
import com.geomtry.*;
class TestPoint2D {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1st cord");
		Point2D p1=new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("enter 2nd cord");
		Point2D p2=new Point2D(sc.nextInt(),sc.nextInt());
        
	    System.out.println("p1= "+p1.getDetials());
	    System.out.println("p2="+p2.getDetials());
	    System.out.println("---------Checking equality--------------");
	    System.out.println(p1.isEqual(p2)?"Same":"Diffrent");
	    System.out.println("---------Creating new point--------------");
	    Point2D p3=p1.createNewPoint(5,-3 );
	    System.out.println("p1="+p1.getDetials());
	    System.out.println("p3="+p3.getDetials());
	    System.out.println("---------Calculating Distance--------------");
	    System.out.println("Distance="+p1.calDistance(p2));
		sc.close();
		
	}

}
