
public class Rectange extends Shape {
	private int side13 = 0;
	private int side24 = 0;
	public Rectange(int a, int p, int side13, int side24) {
		super(a, p);
		this.side13 = side13;
		this.side24 = side24;
	}
	@Override
	public String toString() {
		String temp = "";
		temp = "The top side is " + side13 + ", the right side is " + side24 + ", the bottom side is " + side13 + ", the left side is " + side24 + ", the area is " + super.getArea() + ", and the perimeter is " +  super.getPerimeter();
		return temp;
	}
	public int getSide13() {
		return side13;
	}
	public int getSide24() {
		return side24;
	}
}
