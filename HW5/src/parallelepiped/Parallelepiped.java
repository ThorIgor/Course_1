package parallelepiped;

public class Parallelepiped {
	private Parallelogram basis;
	private Point t;
	
	public Parallelepiped()
	{
		basis = new Parallelogram();
		t = new Point();
	}
	
	public Parallelepiped(Point t1, Point t2, Point t3, Point t4)
	{
		basis = new Parallelogram(t1, t2, t3);
		t = t4;
	}
	
	public Parallelepiped(Point t1, Point t2, Point t3, double dis, double angle)
	{
		basis = new Parallelogram(t1, t2, t3);
		double lamda = (Math.sin(angle)*dis)/Point.distance(t1, t3); 
		t = new Point((t1.getX() + lamda*t3.getX())/(1+lamda), (t1.getY() + lamda*t3.getY())/(1+lamda), Math.cos(angle)*dis + t1.getZ());
	}
	
	public Parallelepiped(Point t, double s1, double s2, double a1, double s3, double a2)
	{
		basis = new Parallelogram(t, new Point(Math.sin(a1)*s2, Math.cos(a1)*s2, t.getZ()), new Point(Math.sin(a1)*s2 + s1, Math.cos(a1)*s2, t.getZ()));
		double lamda = (Math.sin(a2)*s3)/Point.distance(basis.getT1(), basis.getT3()); 
		this.t = new Point((basis.getT1().getX() + lamda*basis.getT3().getX())/(1+lamda), (basis.getT1().getY() + lamda*basis.getT3().getY())/(1+lamda), Math.cos(a1)*s3+t.getZ());
	}
	
	public double getH()
	{
		Point v1 = new Point(basis.getT3().getX()- basis.getT1().getX(), basis.getT3().getY()-basis.getT1().getY(), basis.getT3().getZ()-basis.getT1().getZ());
		Point v2 = new Point(t.getX()- basis.getT1().getX(), t.getY()-basis.getT1().getY(), t.getZ()-basis.getT1().getZ());
		double angle = Math.acos((v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ())/(Point.distance(t, basis.getT1())*Point.distance(basis.getT1(), basis.getT3())));
		return Math.cos(angle)*Point.distance(t, basis.getT1());
	}
	
	public double volume()
	{
		return basis.area()*getH();
	}
	
	public double S()
	{
		return basis.area();
	}
	
	public String toString()
	{
		String str = "Parallelepiped:\n";
		str+=basis + "\n";
		double x = t.getX()-basis.getT1().getX();
		double y = t.getY()-basis.getT1().getY();
		double z = t.getZ()-basis.getT1().getZ();
		str+= new Parallelogram(t, new Point(basis.getT2().getX()+x, basis.getT2().getY()+y, basis.getT2().getZ()+z), new Point(basis.getT3().getX()+x, basis.getT3().getY()+y, basis.getT3().getZ()+z));
		return str;
	}
}
