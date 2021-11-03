public class CalculatorForSchool {
	public static int rand(int a, int b) {
		return (int)((Math.random() * (b + 1)) + a);
	}
	public static double celsiustoF(double c) {
		c = Math.round(((c * 1.8) + 32) * 10);
		return c / 10;
	}
	public static double fahrenheitToCelsius(double f) {
		f = Math.round(((f - 32) * (5.0/9.0)) * 10);
		return f / 10;
	}
	public static double kiloToFeet(double k) {
		k = Math.round((((k * 100000) / 2.54) / 12) * 100);
		return k / 100;
	}
	public static double milesToKilo(double m) {
		m = Math.round(((((m * 5280) * 12) * 2.54) / 100000) * 100);
		return m / 100;
	}
	public static double milesToFeet(double m) {
		return CalculatorForSchool.kiloToFeet(CalculatorForSchool.milesToKilo(m));
	}
	public static double pythagHyp(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	public static double pythagLeg(double h, double a) {
		return Math.sqrt(Math.pow(h, 2) - Math.pow(a, 2));
	}
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
	}
	public static void quadRoots(int a, int b, int c) {
		if((Math.pow(b, 2) - (4 * a * c)) < 0) {
			System.out.println("Imaginary Roots");
		}
		else {
			double proot = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			double nroot = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			if(proot == nroot) {
				System.out.println(proot);
			}
			else {
				System.out.println(proot + " " + nroot);
			}
		}
	}
	public static int posDifference(int a, int b) {
		return Math.abs(a - b);
	}
	public static int max3(int a, int b, int c) {
		if(a > b) {
			if(a > c) {
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if(b > c) {
				return b;
			}
			else {
				return c;
			}
		}
	}
	public static int sumTwoBigs(int a, int b, int c) {
		if(a < b) {
			if(a < c) {
				return b + c;
			}
			else {
				return b + a;
			}
		}
		else {
			if(b < c) {
				return a + c;
			}
			else {
				return a + b;
			}
		}
	}
	
}