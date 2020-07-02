
public class shapeTest {
	public static void main(String[] args) {
		Shape shape = new Shape(0, 1);
		Triange triange = new Triange(0, 1, 0, 0, 0, 0);
		Rectange rectange = new Rectange(0, 1, 0, 0, 90);
		System.out.println(shape.getArea());
		System.out.println(shape.getPerimeter());
		System.out.println(triange.getArea());
		System.out.println(triange.getPerimeter());
		System.out.println(rectange.getArea());
		System.out.println(rectange.getPerimeter());
	}
}
