package com.tester;

import java.util.Scanner;

import com.geomtry.*;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many points to plot");
		Point2D[] point = new Point2D[sc.nextInt()];
		System.out.println("CHOICE");
		System.out.println("1 =  Plot a new point");
		System.out.println("2 =  Display all points plotted");
		System.out.println("3 = Test equality of 2 points");
		System.out.println("4 = Calculate distance");
		System.out.println("10 = Calculate distance");
		boolean flag = true;

		while (flag != false) {
			System.out.println("ENTER CHOICE");
			int c = sc.nextInt();
			switch (c) {

			case 1:
				System.out.println("enter index ,x,y");
				int index = sc.nextInt();

				if (index >= 0 && index <= point.length - 1) {
					point[index] = new Point2D(sc.nextInt(), sc.nextInt());
					
				}
				break;
			case 2:

				for (Point2D p : point) {
					if (p != null) {
						System.out.println(" " + p.getDetials());
					}
				}
				break;
				
			case 3:
				System.out.println("Enter two index to check equality");
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();
				if (index1 >= 0 && index1 < point.length && index2 >= 0 && index2 < point.length) {
                   if(point[index1] !=null && point [index2] !=null)
					System.out.println(point[index1].isEqual(point[index2])?"SAME":"DIFFERENT");
				}
				break;
				
			case 4:
				System.out.println("Enter two index to calculate Distance");
				int start = sc.nextInt();
				int end = sc.nextInt();
				if (start >= 0 && start < point.length && end >= 0 && end < point.length) {
					 if(point[start] !=null && point [end] !=null)
					System.out.println(" Distance = " +point[start].calDistance(point[end]));
				}
				break;
				
			case 10: flag=false;
			         break;

			}
		}
sc.close();
	}

}
