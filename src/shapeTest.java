
public class shapeTest {
	public static void main(String[] args) {
		Triange triange = new Triange(0, 1, 0, 0, 0, 0);
		Rectange rectange = new Rectange(0, 1, 0, 0);
		Paraeogram paraeogram = new Paraeogram(0, 1, 0, 0, 0, 0);
		Shape[] shape = new Shape[3];
		shape[0] = triange;
		shape[1] = rectange;
		shape[2] = paraeogram;
		System.out.println(shape[0]);
		System.out.println(shape[1]);
		System.out.println(shape[2]);
	}
}
