import parallelepiped.*;

public class Test {

	public static void main(String[] args) {
		Parallelepiped p = new Parallelepiped(new Point(0, 0, 0), new Point(0, 1, 1), new Point(1, 1, 2), new Point(0, 3, 2));
		System.out.println(p);
		System.out.println("V = " + p.volume());
		System.out.println("H = " + p.getH());
		System.out.println("S = " + p.S());
		//System.out.println(new Parallelepiped(new Point(0, 0, 0), new Point(0, 1, 1), new Point(1, 1, 2), 2, 1));
		//System.out.println((new Parallelepiped(new Point(0, 0, 0), 2, 2, 1, 2, 1)).volume());
		
	}

}
