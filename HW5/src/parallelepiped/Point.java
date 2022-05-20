package parallelepiped;

public class Point {
	private double x, y, z;
	
	public Point()
	{
		setX(0);
		setY(0);
		setZ(0);
	}
	public Point(double x, double y, double z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public void setC(double x, double y, double z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
	public void setZ(double z) {this.z = z;}
	
	public double getX() {return x;}
	public double getY() {return y;}
	public double getZ() {return z;}
	
	public String toString()
	{
		return "(" + x + ", " + y + ", " + z +")";
	}
	
	public boolean equals(Point p)
	{
		if(x == p.x && y == p.y && z == p.z)
			return true;
		else
			return false;
	}
	
	public static double distance(Point t1, Point t2)
	{
		return Math.sqrt(Math.pow(t1.x-t2.x, 2) + Math.pow(t1.y-t2.y, 2) + Math.pow(t1.z-t2.z, 2));
	}
}
