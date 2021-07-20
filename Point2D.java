package com.geomtry;
 
public class Point2D {
	private int x,y;

	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	 public String getDetials() {
		return "Cord "+this.x+" "+this.y;
		
	}
	public boolean isEqual(Point2D newCord) {
		return this.x == newCord.x && this.y == newCord.y;
	}
	public  Point2D createNewPoint(int xOff,int yOff){
		 Point2D Cord= new Point2D (this.x + xOff,this.y + yOff);
		 return Cord;
	 }
   public  double calDistance(Point2D anotherPoint) {
    	
//          double d1=;
//          double d2=;
          double s1=Math.pow(this.x-anotherPoint.x, 2);
          double s2=Math.pow(this.y-anotherPoint.y, 2);
//          double sqr=;
          double D=Math.sqrt(s1-s2);
          return D;
    	
		 
	 }
 }
