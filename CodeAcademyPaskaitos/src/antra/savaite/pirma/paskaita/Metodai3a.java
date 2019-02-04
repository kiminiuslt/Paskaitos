package antra.savaite.pirma.paskaita;

import java.util.Scanner;

public class Metodai3a {

	public static void main(String[] args) {

		double d1 = m1();

		double d2 = m2();

		System.out.println("suma lygi: " + (d1 + d2));

	}

	public static double m1() {

		return 123.5;

	}

	public static double m2() {
		Scanner skeneris = new Scanner(System.in);

		System.out.println("Iveskite skaiciu");

		return skeneris.nextDouble();

	}
}
