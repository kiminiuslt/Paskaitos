package antra.savaite.pirma.paskaita;

import java.util.Scanner;

public class Metodai6 {

	public static void main(String[] args) {
		
		int d = padidink(2);
		
		
		System.out.println(" skaicius " + d);
		

	}
	public static int padidink(int a) {
		
		Scanner skeneris = new Scanner(System.in);
		
		System.out.println("iveskite skaiciu");
		
		int b = skeneris.nextInt();
		int c = b++;
		 
		return c;
		
		
		
	}
}
