package trecia.savaite.pirma.paskaita;

import java.util.Random;

public class uzduotis4DoWhile {

	public static void main(String[] args) {
		Random random = new Random();

		int i = 1;

		int b = 0;

		do {

			int skaicius = random.nextInt(1000);

			System.out.println(i + " spetas skaicius " + skaicius);

			i++;

			if (b < skaicius) {
				b = skaicius;
			}
		} while (i < 21);

		System.out.println("didziausias skaicius " + b);

	}

}
