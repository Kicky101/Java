
public class Triange extends Shape {
	private int side1 = 0;
	private int side2 = 0;
	private int side3 = 0;
	private int height = 0;
	public Triange(int a, int p, int side1, int side2, int side3, int height) {
		super(a, p);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}
	@Override
	public String toString() {
		String temp = "";
		temp = "The left side is " + side1 + ", the right side is " + side2 + ", the bottom side is " + side3 + ", the height is " + height + ", the area is " + super.getArea() + ", the perimeter is " + super.getPerimeter();
		return temp;
	}
}
