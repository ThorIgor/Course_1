package parallelepiped;

public class Parallelogram {
	private final Point t[] = new Point[4];
	
	public Parallelogram()
	{
		for(Point p : t)
			p = new Point();
	}
	public Parallelogram(Point t1, Point t2, Point t3)
	{
		setT1(t1);
		setT2(t2);
		setT3(t3);
		setT4(new Point((t1.getX() + t3.getX() - t2.getX()), (t1.getY() + t3.getY() - t2.getY()), (t1.getZ() + t3.getZ() - t2.getZ())));
	}
	public Parallelogram(Point t1, Point t2, Point t3, Point t4)
	{
		setC(t1, t2, t3, t4);
	}
	
	public void setC(Point t1, Point t2, Point t3)
	{
		setT1(t1);
		setT2(t2);
		setT3(t3);
		setT4(new Point((t1.getX() + t3.getX() - t2.getX()), (t1.getY() + t3.getY() - t2.getY()), (t1.getZ() + t3.getZ() - t2.getZ())));
	}
	public void setC(Point t1, Point t2, Point t3, Point t4)
	{
		if(Point.distance(t1, t2) == Point.distance(t3, t4) && Point.distance(t1, t4) == Point.distance(t2, t3))
		{
			setT1(t1);
			setT2(t2);
			setT3(t3);
			setT4(t4);
		}
	}
	
	private void setT1(Point t1) {t[0] = t1;}
	private void setT2(Point t2) {t[1] = t2;}
	private void setT3(Point t3) {t[2] = t3;}
	private void setT4(Point t4) {t[3] = t4;}
	
	public Point getT1() {return t[0];}
	public Point getT2() {return t[1];}
	public Point getT3() {return t[2];}
	public Point getT4() {return t[3];}
	
	public double area()
	{
		Point v1 = new Point(t[3].getX()- t[0].getX(), t[3].getY()-t[0].getY(), t[3].getZ()-t[0].getZ());
		Point v2 = new Point(t[1].getX()- t[0].getX(), t[1].getY()-t[0].getY(), t[1].getZ()-t[0].getZ());
		double angle = Math.acos((v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ())/(Point.distance(t[0], t[3])*Point.distance(t[0], t[1])));
		return Point.distance(t[0], t[1])*Point.distance(t[0], t[3])*Math.asin(angle);	
	}
	
 	public String toString()
	{
		String str = "Parallelogram:";
		for(Point p : t)
			str+="\n" + p;
		return str;
	}
	
}
