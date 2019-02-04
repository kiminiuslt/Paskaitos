package antra.savaite.pirma.paskaita;

public class Metodai5 {

	public static void main(String[] args) {

		double a = 5;
		double b = 2.5;

		trikampis(a, b);

	}

	public static void trikampis(double a, double b) {

		double S = (a * b) / 2;

		double P = a + b + (Math.sqrt((a * a) + (b * b)));

		System.out.println("trikampio plotas: " + S);
		System.out.println("trikampio perimetras: " + P);

	}
}
