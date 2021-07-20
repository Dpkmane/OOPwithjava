package com.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.geomtry.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of boxes");
		Box[] boxes=new Box[sc.nextInt()];
		System.out.println("def "+Arrays.toString(boxes));
		for(int i=0;i<boxes.length;i++) {
			System.out.println("enter :W h d");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		for(Box i :boxes) {
			System.out.println(i.getBoxDims());
			System.out.println(i.computeVolume());
			
		}
		System.out.println("  "+Arrays.toString(boxes));
		sc.close();

	}

}
