package antra.savaite.antra.paskaita;

import java.util.Random;

public class RandomUzduotis1 {

	public static void main(String[] args) {

		Random xxx = new Random();

		int a = xxx.nextInt(99) + 1;

		int b = xxx.nextInt(99) + 1;

		int c = xxx.nextInt(99) + 1;

		String skaiciai = "";

		System.out.println("skaiciai " + (a) + ", " + (b) + ", " + (c));
		

		if (a > b && a>c) {
				System.out.println("didziausias skaicius " + a);
				
			}
			else if (b > a && b > c) {
					System.out.println("didziausias didziausias " + b);
				}
			else {
				System.out.println("ma x"+ c );
			}
		// java swing

		}
}
